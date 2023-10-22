abstract class Furniture {
    private String type;

    public Furniture(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void displayInfo();
}
class Chair extends Furniture {
    private boolean hasBackrest;

    public Chair(boolean hasBackrest) {
        super("Chair");
        this.hasBackrest = hasBackrest;
    }

    @Override
    void displayInfo() {
        String hasBack = hasBackrest ? "with backrest" : "without backrest";
        System.out.println("Chair " + hasBack);
    }
}

class Table extends Furniture {
    private int numberOfLegs;

    public Table(int numberOfLegs) {
        super("Table");
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    void displayInfo() {
        System.out.println("Table with " + numberOfLegs + " legs");
    }
}

// Класс FurnitureShop
class FurnitureShop {
    void displayFurniture(Furniture furniture) {
        System.out.print("Furniture type: " + furniture.getType() + ", ");
        furniture.displayInfo();
    }
}

// Пример использования:
public class FurnitureTest {
    public static void main(String[] args) {
        Furniture chair = new Chair(true);
        Furniture table = new Table(4);

        FurnitureShop shop = new FurnitureShop();
        shop.displayFurniture(chair);
        shop.displayFurniture(table);
    }
}

abstract class Dish {
    private String material;

    public Dish(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    abstract void displayInfo();
}

class Plate extends Dish {
    private int diameter;

    public Plate(String material, int diameter) {
        super(material);
        this.diameter = diameter;
    }

    @Override
    void displayInfo() {
        System.out.println("Plate made of " + getMaterial() + ", Diameter: " + diameter + " cm");
    }
}

class Cup extends Dish {
    private boolean handle;

    public Cup(String material, boolean handle) {
        super(material);
        this.handle = handle;
    }

    @Override
    void displayInfo() {
        String hasHandle = handle ? "with handle" : "without handle";
        System.out.println("Cup made of " + getMaterial() + ", " + hasHandle);
    }
}

// Пример использования:
public class DishTest {
    public static void main(String[] args) {
        Dish plate = new Plate("Ceramic", 20);
        Dish cup = new Cup("Glass", true);

        plate.displayInfo();
        cup.displayInfo();
    }
}

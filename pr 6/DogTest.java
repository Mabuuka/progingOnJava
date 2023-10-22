abstract class Dog {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    abstract void bark();
}
class Labrador extends Dog {
    public Labrador() {
        super("Labrador");
    }

    @Override
    void bark() {
        System.out.println("Labrador is barking");
    }
}

class Bulldog extends Dog {
    public Bulldog() {
        super("Bulldog");
    }

    @Override
    void bark() {
        System.out.println("Bulldog is barking");
    }
}

// Пример использования:
public class DogTest {
    public static void main(String[] args) {
        Dog labrador = new Labrador();
        Dog bulldog = new Bulldog();

        labrador.bark();
        bulldog.bark();
    }
}

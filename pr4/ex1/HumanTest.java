// Класс, описывающий голову человека
class Head {
    private String eyeColor;

    // Конструктор
    public Head(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // Метод для получения цвета глаз
    public String getEyeColor() {
        return eyeColor;
    }
}

// Класс, описывающий ногу человека
class Leg {
    private int length;

    // Конструктор
    public Leg(int length) {
        this.length = length;
    }

    // Метод для получения длины ноги
    public int getLength() {
        return length;
    }
}

// Класс, описывающий руку человека
class Hand {
    private int fingers;

    // Конструктор
    public Hand(int fingers) {
        this.fingers = fingers;
    }

    // Метод для получения количества пальцев на руке
    public int getFingers() {
        return fingers;
    }
}

// Класс, описывающий тело человека
class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    // Конструктор
    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    // Методы для получения частей тела
    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }
}

// Класс для тестирования
public class HumanTest {
    public static void main(String[] args) {
        // Создаем объекты частей тела
        Head head = new Head("Карие");
        Leg leg = new Leg(100);
        Hand hand = new Hand(5);

        // Создаем объект человека
        Human person = new Human(head, leg, hand);

        // Выводим информацию о человеке
        System.out.println("Цвет глаз: " + person.getHead().getEyeColor());
        System.out.println("Длина ноги: " + person.getLeg().getLength() + " см");
        System.out.println("Количество пальцев на руке: " + person.getHand().getFingers());
    }
}

//В этом примере создаются классы Head, Leg и Hand, представляющие голову, ногу и руку человека соответственно.
//Затем создается класс Human, который состоит из объектов классов Head, Leg и Hand.
//В классе HumanTest создаются объекты частей тела и объект человека, и выводится информация о человеке.

// Класс, описывающий книгу
class Book {
    private String author; // автор книги
    private String title; // название книги
    private int year; // год написания книги

    // Конструктор для создания объекта книги
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Методы для получения свойств книги
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    // Методы для изменения свойств книги
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Класс для тестирования класса Book
public class BookTest {
    public static void main(String[] args) {
        // Создаем объект книги
        Book book = new Book("Автор книги", "Название книги", 2023);

        // Выводим информацию о книге
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменяем свойства книги
        book.setAuthor("Какой-то автор");
        book.setTitle("Какое-то название книги");
        book.setYear(2025);

        // Выводим обновленную информацию о книге
        System.out.println("Обновленный автор: " + book.getAuthor());
        System.out.println("Обновленное название: " + book.getTitle());
        System.out.println("Обновленный год написания: " + book.getYear());
    }
}

//В этом примере создается класс Book, который имеет свойства author, title и year, а также методы для получения (getAuthor(), getTitle(), getYear())
//и изменения (setAuthor(), setTitle(), setYear()) этих свойств. Затем этот класс тестируется в классе BookTest в методе main()

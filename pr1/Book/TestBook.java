public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("Война и мир", "Лев Николаевич Толстой");
        System.out.println(b2);
        Book b3 = new Book("Длинное название", "Известный Автор", "Большое издательство", 15000, 1865);
        System.out.println(b3);
    }
}

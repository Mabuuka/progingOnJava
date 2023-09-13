public class Author {
    // Приватные поля класса Author
    private String name, email;
    private char gender;

    // Конструктор класса Author
    public Author(String name, String email, char gender) {
        // Инициализация полей объекта
        this.name = name;
        this.email = email;

        // Проверка на допустимые значения пола ('m' - мужской, 'f' - женский)
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("Недопустимый пол: " + gender);
        }

        this.gender = gender;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Геттер для поля email
    public String getEmail() {
        return email;
    }

    // Сеттер для поля email
    public void setEmail(String email) {
        this.email = email;
    }

    // Геттер для поля gender
    public char getGender() {
        return gender;
    }

    // Переопределение метода toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

public class InsertionSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Саша"),
                new Student(101, "Петя"),
                new Student(105, "Галя"),
                new Student(102, "Лена"),
                new Student(104, "Лёша")
        };

        System.out.println("Не отсортированный список студентов:");
        printStudents(students);

        InsertionSort.sortByIDNumber(students);

        System.out.println("\nОтсортированный список студентов по номеру студенческого:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

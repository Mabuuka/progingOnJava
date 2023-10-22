import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Алиса", 3.8),
                new Student("Боб", 3.5),
                new Student("Чарли", 4.0),
                new Student("Дэвид", 3.9)
        );

        students.sort(new SortingStudentsByGPA());

        for (Student student : students) {
            System.out.println("Студент: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

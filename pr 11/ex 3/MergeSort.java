import java.util.ArrayList;
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

public class MergeSort {
    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int middle = students.size() / 2;
        List<Student> left = students.subList(0, middle);
        List<Student> right = students.subList(middle, students.size());

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getGPA() > right.get(rightIndex).getGPA()) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result;
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Алиса", 3.8));
        students1.add(new Student("Боб", 3.5));
        students1.add(new Student("Чарли", 4.0));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Дэвид", 3.9));
        students2.add(new Student("Ева", 3.7));

        List<Student> mergedStudents = mergeSort(new ArrayList<>(students1));
        mergedStudents.addAll(mergeSort(new ArrayList<>(students2)));

        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedStudents) {
            System.out.println("Студент: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

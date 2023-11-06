import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true));
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите текст для добавления в файл: ");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

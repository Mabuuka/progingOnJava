import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите новый текст для замены в файле: ");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();

            System.out.println("Текст в файле успешно заменен.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

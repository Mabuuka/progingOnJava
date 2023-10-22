import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplay {
    public static void main(String[] args) {
        // Название файла картинки (вместо аргумента командной строки)
        String imageName = "C:\\Users\\serez\\Desktop\\nRiqNpC.jpg"; // Замените на имя вашей картинки

        // Проверяем расширение файла
        if (!imageName.toLowerCase().endsWith(".png") &&
                !imageName.toLowerCase().endsWith(".jpeg") &&
                !imageName.toLowerCase().endsWith(".jpg")) {
            System.out.println("Invalid file format. Supported formats: .png, .jpeg, .jpg");
            return;
        }

        try {
            // Загружаем картинку из файла
            BufferedImage image = ImageIO.read(new File(imageName));

            // Создаем и настраиваем окно для отображения картинки
            JFrame frame = new JFrame("Image Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(image.getWidth(), image.getHeight());

            // Панель для отображения картинки
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            // Добавляем панель к окну и отображаем окно
            frame.add(panel);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error loading the image: " + e.getMessage());
        }
    }
}

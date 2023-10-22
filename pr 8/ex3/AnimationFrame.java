import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AnimationFrame extends JFrame {
    private BufferedImage[] frames; // Массив кадров анимации
    private int currentFrameIndex = 0; // Индекс текущего кадра

    public AnimationFrame() {
        try {
            // Загрузка кадров изображения
            frames = new BufferedImage[6]; // Здесь 6 - количество кадров в анимации
            for (int i = 0; i < frames.length; i++) {
                frames[i] = ImageIO.read(new File("C:\\Users\\serez\\Desktop\\image" + (i + 1) + ".jpg"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Создание таймера для обновления анимации
        Timer timer = new Timer(245, e -> {
            repaint(); // Перерисовываем окно для отображения следующего кадра
            currentFrameIndex = (currentFrameIndex + 1) % frames.length; // Переходим к следующему кадру
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Отображение текущего кадра в окне
        g.drawImage(frames[currentFrameIndex], 50, 50, this);
    }

    public static void main(String[] args) {
        AnimationFrame frame = new AnimationFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}

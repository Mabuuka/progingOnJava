import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPNCalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private Stack<Double> stack;

    public RPNCalculator() {
        setTitle("RPN Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        stack = new Stack<>();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        inputField = new JTextField();
        mainPanel.add(inputField, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        mainPanel.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("=")) {
            calculate();
        } else {
            String currentInput = inputField.getText();
            inputField.setText(currentInput + actionCommand);
        }
    }

    private void calculate() {
        String input = inputField.getText();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double num2 = stack.pop();
                double num1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                }
            }
        }

        double result = stack.pop();
        outputArea.setText(Double.toString(result));
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RPNCalculator calculator = new RPNCalculator();
            calculator.setVisible(true);
        });
    }
}

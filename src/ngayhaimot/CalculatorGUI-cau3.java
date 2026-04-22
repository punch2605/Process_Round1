package sds;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JComboBox<String> cbOperator;
    private JButton btnCalculate;

    public CalculatorGUI() {
        setTitle("Máy tính đơn giản");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        panel.add(new JLabel("Nhập a:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập b:"));
        txtB = new JTextField();
        panel.add(txtB);

        panel.add(new JLabel("Chọn phép tính:"));
        cbOperator = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        panel.add(cbOperator);

        panel.add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        panel.add(txtResult);

        btnCalculate = new JButton("Tính");
        panel.add(new JLabel());
        panel.add(btnCalculate);

        add(panel);

        btnCalculate.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                String op = (String) cbOperator.getSelectedItem();
                double result = 0;

                switch (op) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/":
                        if (b == 0) {
                            JOptionPane.showMessageDialog(null, "Không thể chia cho 0!");
                            return;
                        }
                        result = a / b;
                        break;
                }

                txtResult.setText(a + " " + op + " " + b + " = " + result);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
            }
        });
    }

    public static void main(String[] args) {
        new CalculatorGUI().setVisible(true);
    }
}
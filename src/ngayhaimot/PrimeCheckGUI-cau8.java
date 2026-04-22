package sds;

import javax.swing.*;
import java.awt.*;

public class PrimeCheckGUI extends JFrame {
    private JTextField txtNumber, txtResult;
    private JButton btnCheck;

    public PrimeCheckGUI() {
        setTitle("Kiểm tra số nguyên tố");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Nhập a:"));
        txtNumber = new JTextField();
        panel.add(txtNumber);

        panel.add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        panel.add(txtResult);

        btnCheck = new JButton("Kiểm tra");
        panel.add(new JLabel());
        panel.add(btnCheck);

        add(panel);

        btnCheck.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtNumber.getText());

                if (isPrime(a)) {
                    txtResult.setText(a + " là số nguyên tố");
                } else {
                    txtResult.setText(a + " không phải là số nguyên tố");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
            }
        });
    }

    // Hàm kiểm tra số nguyên tố
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new PrimeCheckGUI().setVisible(true);
    }
}
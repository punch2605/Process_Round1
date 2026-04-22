package ngayhaimot;

import javax.swing.*;
import java.awt.*;

public class GiaiPTBacNhatGUI extends JFrame {

    private JTextField txtA, txtB;
    private JTextArea txtResult;

    public GiaiPTBacNhatGUI() {
        setTitle("Giải phương trình bậc nhất");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Nhập a:"));
        txtA = new JTextField();
        add(txtA);

        add(new JLabel("Nhập b:"));
        txtB = new JTextField();
        add(txtB);

        JButton btnSolve = new JButton("Giải");
        add(btnSolve);
        add(new JLabel());

        add(new JLabel("Kết quả:"));
        txtResult = new JTextArea();
        txtResult.setEditable(false);
        add(new JScrollPane(txtResult));

        btnSolve.addActionListener(e -> solveEquation());
    }

    private void solveEquation() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());

            if (a == 0) {
                if (b == 0) {
                    txtResult.setText("Phương trình 0x + 0 = 0 có vô số nghiệm");
                } else {
                    txtResult.setText("Phương trình 0x + " + b + " = 0 vô nghiệm");
                }
            } else {
                double x = -b / a;
                txtResult.setText("Phương trình " + a + "x + " + b + " = 0 có nghiệm x = " + x);
            }

        } catch (NumberFormatException ex) {
            txtResult.setText("Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GiaiPTBacNhatGUI().setVisible(true);
        });
    }
}
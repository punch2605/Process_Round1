package ngayhaimot;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SapXep3SoGUI extends JFrame {

    private JTextField txtA, txtB, txtC;
    private JTextArea txtResult;

    public SapXep3SoGUI() {
        setTitle("Sắp xếp 3 số tăng dần");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 10, 10));

        // Input
        add(new JLabel("Nhập a:"));
        txtA = new JTextField();
        add(txtA);

        add(new JLabel("Nhập b:"));
        txtB = new JTextField();
        add(txtB);

        add(new JLabel("Nhập c:"));
        txtC = new JTextField();
        add(txtC);

        // Button
        JButton btnSort = new JButton("Sắp xếp");
        add(btnSort);
        add(new JLabel());

        // Result
        add(new JLabel("Kết quả:"));
        txtResult = new JTextArea();
        txtResult.setEditable(false);
        add(new JScrollPane(txtResult));

        // Xử lý
        btnSort.addActionListener(e -> sortNumbers());
    }

    private void sortNumbers() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            double[] arr = {a, b, c};
            Arrays.sort(arr);

            txtResult.setText(arr[0] + ", " + arr[1] + ", " + arr[2]);

        } catch (NumberFormatException ex) {
            txtResult.setText("Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SapXep3SoGUI().setVisible(true);
        });
    }
}
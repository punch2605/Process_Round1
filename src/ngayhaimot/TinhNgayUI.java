package com.mycompany.baikiemtranhom;
import javax.swing.JOptionPane;

public class TinhNgayUI {
    public static void main(String[] args) {
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Nhập tháng:"));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nhập năm:"));

        int soNgay = 0;
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tháng không hợp lệ!");
                return;
        }

        JOptionPane.showMessageDialog(null, "Tháng " + thang + "/" + nam + " có " + soNgay + " ngày.");
    }
}
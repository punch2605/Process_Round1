package com.mycompany.baikiemtranhom;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TimMaxUI {
    public static void main(String[] args) {
        // Nhập dữ liệu qua hộp thoại
        String sa = JOptionPane.showInputDialog("Nhập số a:");
        String sb = JOptionPane.showInputDialog("Nhập số b:");
        String sc = JOptionPane.showInputDialog("Nhập số c:");

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        // Hiển thị kết quả ra màn hình
        JOptionPane.showMessageDialog(null, "Số lớn nhất là: " + max);
    }
}
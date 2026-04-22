package ngayhaimot;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width, area;

        // Nhập chiều dài (kiểm tra số dương)
        while (true) {
            System.out.print("Nhập chiều dài: ");
            length = scanner.nextDouble();
            if (length > 0) {
                break;
            } else {
                System.out.println("Nhập sai.");
            }
        }

        // Nhập chiều rộng (kiểm tra số dương)
        while (true) {
            System.out.print("Nhập chiều rộng: ");
            width = scanner.nextDouble();
            if (width > 0) {
                break;
            } else {
                System.out.println("Nhập sai.");
            }
        }

        // Tính diện tích
        area = length * width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
        
        scanner.close();
    }
}
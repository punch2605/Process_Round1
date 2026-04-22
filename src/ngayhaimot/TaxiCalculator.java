package ngayhaimot;

import java.util.Scanner;

public class TaxiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km, tien;

        System.out.print("Nhập số km: ");
        km = scanner.nextDouble();

        if (km < 0) {
            System.out.println("nhập dữ liệu sai");
        } else {
            tien = km * 10000; // 10.000 VND/km
            System.out.println("Tiền taxi = " + tien + " VND");
        }

        scanner.close();
    }
}
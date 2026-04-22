package ngayhaimot;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            System.out.print("Chọn chương trình (0-8): ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculateRectangleArea(scanner);
                        break;
                    case 2:
                        calculateTaxiFare(scanner);
                        break;
                    case 3:
                        findMaxNumber();
                        break;
                    case 4:
                        calculateDaysInMonth();
                        break;
                    case 5:
                        openCalculator();
                        break;
                    case 6:
                        solveLinearEquation();
                        break;
                    case 7:
                        sortThreeNumbers();
                        break;
                    case 8:
                        checkPrimeNumber();
                        break;
                    case 0:
                        System.out.println("Tạm biệt!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
                scanner.nextLine();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║           MENU CHÍNH                       ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ 1. Tính diện tích hình chữ nhật            ║");
        System.out.println("║ 2. Tính tiền taxi                          ║");
        System.out.println("║ 3. Tìm số lớn nhất (3 số)                  ║");
        System.out.println("║ 4. Tính số ngày trong tháng                ║");
        System.out.println("║ 5. Máy tính đơn giản                       ║");
        System.out.println("║ 6. Giải phương trình bậc nhất (ax+b=0)     ║");
        System.out.println("║ 7. Sắp xếp 3 số tăng dần                   ║");
        System.out.println("║ 8. Kiểm tra số nguyên tố                   ║");
        System.out.println("║ 0. Thoát                                   ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // 1. Tính diện tích hình chữ nhật
    private static void calculateRectangleArea(Scanner scanner) {
        System.out.println("\n--- Tính diện tích hình chữ nhật ---");
        double length, width, area;

        while (true) {
            System.out.print("Nhập chiều dài: ");
            length = scanner.nextDouble();
            if (length > 0) break;
            else System.out.println("Nhập sai. Vui lòng nhập số dương.");
        }

        while (true) {
            System.out.print("Nhập chiều rộng: ");
            width = scanner.nextDouble();
            if (width > 0) break;
            else System.out.println("Nhập sai. Vui lòng nhập số dương.");
        }

        area = length * width;
        System.out.println("✓ Diện tích hình chữ nhật là: " + area);
    }

    // 2. Tính tiền taxi
    private static void calculateTaxiFare(Scanner scanner) {
        System.out.println("\n--- Tính tiền taxi ---");
        System.out.print("Nhập số km: ");
        double km = scanner.nextDouble();

        if (km < 0) {
            System.out.println("Nhập dữ liệu sai");
        } else {
            double tien = km * 10000; // 10.000 VND/km
            System.out.println("✓ Tiền taxi = " + tien + " VND");
        }
    }

    // 3. Tìm số lớn nhất
    private static void findMaxNumber() {
        System.out.println("\n--- Tìm số lớn nhất (3 số) ---");
        String sa = JOptionPane.showInputDialog("Nhập số a:");
        String sb = JOptionPane.showInputDialog("Nhập số b:");
        String sc = JOptionPane.showInputDialog("Nhập số c:");

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        JOptionPane.showMessageDialog(null, "Số lớn nhất là: " + max);
    }

    // 4. Tính số ngày trong tháng
    private static void calculateDaysInMonth() {
        System.out.println("\n--- Tính số ngày trong tháng ---");
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Nhập tháng (1-12):"));
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

    // 5. Máy tính đơn giản
    private static void openCalculator() {
        System.out.println("\n--- Máy tính đơn giản ---");
        System.out.println("Mở cửa sổ Máy tính...");
        new Thread(() -> {
            try {
                CalculatorGUI calc = new CalculatorGUI();
                calc.setVisible(true);
            } catch (Exception e) {
                System.out.println("Lỗi: Không thể mở Máy tính.");
            }
        }).start();
    }

    // 6. Giải phương trình bậc nhất
    private static void solveLinearEquation() {
        System.out.println("\n--- Giải phương trình bậc nhất (ax + b = 0) ---");
        System.out.println("Mở cửa sổ Giải phương trình...");
        new Thread(() -> {
            try {
                GiaiPTBacNhatGUI eq = new GiaiPTBacNhatGUI();
                eq.setVisible(true);
            } catch (Exception e) {
                System.out.println("Lỗi: Không thể mở Giải phương trình.");
            }
        }).start();
    }

    // 7. Sắp xếp 3 số
    private static void sortThreeNumbers() {
        System.out.println("\n--- Sắp xếp 3 số tăng dần ---");
        System.out.println("Mở cửa sổ Sắp xếp...");
        new Thread(() -> {
            try {
                SapXep3SoGUI sort = new SapXep3SoGUI();
                sort.setVisible(true);
            } catch (Exception e) {
                System.out.println("Lỗi: Không thể mở Sắp xếp.");
            }
        }).start();
    }

    // 8. Kiểm tra số nguyên tố
    private static void checkPrimeNumber() {
        System.out.println("\n--- Kiểm tra số nguyên tố ---");
        System.out.println("Mở cửa sổ Kiểm tra số nguyên tố...");
        new Thread(() -> {
            try {
                PrimeCheckGUI prime = new PrimeCheckGUI();
                prime.setVisible(true);
            } catch (Exception e) {
                System.out.println("Lỗi: Không thể mở Kiểm tra số nguyên tố.");
            }
        }).start();
    }
}

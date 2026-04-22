# Hướng Dẫn Sử Dụng Menu

## Giới Thiệu
File **Menu.java** là chương trình menu chính tích hợp toàn bộ chức năng của 8 ứng dụng:

## Danh Sách Chương Trình

| Số | Chương Trình | Chức Năng |
|---|---|---|
| 1 | Tính diện tích hình chữ nhật | Nhập chiều dài, chiều rộng → tính diện tích |
| 2 | Tính tiền taxi | Nhập số km → tính tiền taxi (10.000 VND/km) |
| 3 | Tìm số lớn nhất (3 số) | Nhập 3 số → tìm số lớn nhất |
| 4 | Tính số ngày trong tháng | Nhập tháng, năm → tính số ngày |
| 5 | Máy tính đơn giản | Nhập 2 số, chọn phép tính (+, -, *, /) → tính kết quả |
| 6 | Giải phương trình bậc nhất | Nhập a, b → giải ax + b = 0 |
| 7 | Sắp xếp 3 số tăng dần | Nhập 3 số → sắp xếp từ nhỏ đến lớn |
| 8 | Kiểm tra số nguyên tố | Nhập số → kiểm tra có phải số nguyên tố |
| 0 | Thoát | Kết thúc chương trình |

## Cách Chạy

### Bước 1: Compile
```bash
cd /Users/admin/Downloads/ngayhaimot/src
javac ngayhaimot/*.java
```

### Bước 2: Chạy Menu
```bash
java ngayhaimot.Menu
```

### Bước 3: Sử dụng
- Chương trình sẽ hiển thị menu với các lựa chọn
- Nhập số từ 0-8 để chọn chương trình
- Thực hiện công việc theo hướng dẫn
- Nhập 0 để thoát

## Tính Năng Menu

✓ **Giao diện đẹp**: Menu được trang trí với các ký tự đặc biệt  
✓ **Xử lý lỗi**: Tự động xử lý khi nhập sai dữ liệu  
✓ **Tích hợp**: Kết hợp cả ứng dụng console và GUI  
✓ **Dễ sử dụng**: Menu vòng lặp, có thể chọn nhiều chương trình  

## Ghi Chú

- **Các chương trình 5, 6, 7, 8** sử dụng GUI (Swing) sẽ mở cửa sổ riêng
- **Các chương trình 1, 2, 3, 4** chạy trong console
- Bạn có thể chạy nhiều GUI cùng lúc
- Nhập 0 để quay trở lại menu và chọn chương trình khác

## Cấu Trúc File

```
ngayhaimot/
├── Menu.java (MENU CHÍNH - File mới)
├── RectangleArea.java (Tính diện tích)
├── TaxiCalculator.java (Tính tiền taxi)
├── TimMaxUI.java (Tìm số lớn nhất)
├── TinhNgayUI.java (Tính ngày)
├── CalculatorGUI-cau3.java (Máy tính)
├── GiaiPTBacNhatGUI.java (Giải PT)
├── SapXep3SoGUI.java (Sắp xếp)
└── PrimeCheckGUI-cau8.java (Kiểm tra số nguyên tố)
```

---
**Tất cả các file đã được cập nhật package declaration để phù hợp với Menu chính**

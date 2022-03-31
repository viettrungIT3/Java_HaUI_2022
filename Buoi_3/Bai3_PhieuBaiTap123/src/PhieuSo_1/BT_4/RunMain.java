package PhieuSo_1.BT_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Xe> list = new ArrayList<>();
        while (true) {
            System.out.println("===MENU===");
            System.out.println("a. Nhập thông tin và tạo dan sách các xe");
            System.out.println("b. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("c. Thoát.");

            String k;
            System.out.printf("Mời bạn chọn: ");    k = scanner.next();
            switch (k) {
                case "a":
                    Xe xe = new Xe();
                    xe.nhap();
                    list.add(xe);
                    break;
                case "b":
                    System.out.printf("%-30s %-15s %10s %20s %20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                    System.out.println("\n===================================================================================================");
                    for (Xe xe1 : list) {
                        xe1.xuat();
                    }
                    break;
                case "c":
                    System.exit(0);
            }
        }
    }
}

package BaiTap_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xedemo {

    public static Scanner scanner = new Scanner(System.in);
    static List<Xe> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("===MENU===");
            System.out.println("a. Nhập thông tin và tạo dan sách các xe");
            System.out.println("b. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("c. Thoát.");

            String k;
            System.out.printf("Mời bạn chọn: ");    k = scanner.next();
            switch (k) {
                case "a":
                    Xedemo.nhap();
                    break;
                case "b":
                    Xedemo.inDL();
                    break;
                case "c":
                    System.exit(0);
            }
        }
    }

    public static void nhap() {
        Xe xe = new Xe();
        xe.nhap();
        list.add(xe);
    }

    public static void inDL() {
        System.out.printf("%-30s %-15s %10s %20s %20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("\n===================================================================================================");
        for (Xe xe1 : list) {
            xe1.xuat();
        }
    }
}

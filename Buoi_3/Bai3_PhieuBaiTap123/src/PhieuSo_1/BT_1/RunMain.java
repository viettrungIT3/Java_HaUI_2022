package PhieuSo_1.BT_1;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HCN hcn = new HCN();

        System.out.println("Nhập thông tin hình chữ nhật: ");
        System.out.print("  Nhập chiều dài: ");     hcn.setDai(scanner.nextFloat());
        System.out.print("  Nhập chiều rộng: ");     hcn.setRong(scanner.nextFloat());

        System.out.println("=============================");
        System.out.println("Thông tin hình chữ nhật: ");
        System.out.printf("  Chiều dài: %.2f", hcn.getDai());
        System.out.printf("\n  Chiều rộng: %.2f", hcn.getRong());
        System.out.printf("\n  Chu vi: %.2f", hcn.chuVi());
        System.out.printf("\n  Diện tích: %.2f", hcn.dienTich());
    }
}

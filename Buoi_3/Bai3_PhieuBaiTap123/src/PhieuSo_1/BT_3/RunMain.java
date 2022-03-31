package PhieuSo_1.BT_3;

import PhieuSo_1.BT_2.Circle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<PTB2> list = new ArrayList<>();

        while (true) {
            PTB2 ptb2 = new PTB2();
            System.out.println("Nhập thông tin phương trình bậc 2: ");
            ptb2.nhap();

            list.add(ptb2);

            String k;
            System.out.printf("Bạn có muốn tiếp tục nhập dữ liệu không(C/K)? ");
            k = scanner.next();
            if (k.equals("K") || k.equals("k"))
                break;
        }

        System.out.println("===========================");
        System.out.printf("%-4s|   ", "#");
        System.out.println("Phương trình bậc 2: ");
        for ( PTB2 ptb2 : list ) {
            System.out.printf("%-4s|   ", (list.indexOf(ptb2) + 1));
            ptb2.xuat();
        }
    }
}

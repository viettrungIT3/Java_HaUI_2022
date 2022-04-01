package BaiTap_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PTB2demo {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<PTB2> list = new ArrayList<>();

        while (true) {
            PTB2 ptb2 = new PTB2();
            System.out.println("Nhập thông tin phương trình bậc 2: ");
            ptb2.nhap();
            System.out.print("Phương trình vừa nhập là: " + ptb2.inPTB2());
            System.out.println();

            list.add(ptb2);

            String k;
            System.out.print("Bạn có muốn tiếp tục nhập dữ liệu không(C/K)? ");
            k = scanner.next();
            if (k.equals("K") || k.equals("k"))
                break;
        }

        PTB2.tieuDe();
        for ( PTB2 ptb2 : list ) {
            System.out.printf("%-4s|   ", (list.indexOf(ptb2) + 1));
            ptb2.xuatPTB2();
        }
    }
}

package Bai_01;

import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();

        boolean flag = true;    // khởi tạo biến kiếm tra = true

        if (n < 2)
            flag = false;   // nếu số đó nhỏ hơn 2 thì không phải là số nguyên tố
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 2 == 0)
                    flag = false;   // nếu số đó có ước trong đoạn [2; sqrt(n)] thì không phải là số nguyên tố
            }
        }

        // còn lại là số nguyên tố

        if (!flag)
            System.out.println("NO");
        else System.out.println("YES");
    }
}

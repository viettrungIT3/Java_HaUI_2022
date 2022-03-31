package Bai_04;

import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhập m = ");
        int m = scanner.nextInt();
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();

        // Tính C(m,n) theo công thức
        float c = (float) GT(n) / (GT(m) * GT((m - n)));

        System.out.println("C(" + m + "," + n + ") = " + c);

    }

    // Hàm tính giai thừa theo đệ quy
    public static long GT(int n) {
        if (n == 0)
            return 1;
        return n * GT(n - 1);
    }
}

package Bai_03;

import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();

        System.out.println("GT(" + n + ") = " + GT(n));
    }

    // Hàm tính giai thừa theo đệ quy
    public static long GT(int n) {
        if (n == 0)
            return 1;
        return n * GT(n - 1);
    }
}

package Bai_05;

import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhập lần lượt 2 số nguyên: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("UCLN(" + a + ", " + b + ") = " + ucln(a, b));
    }

    // Tính UCLN theo đệ quy
    public static int ucln(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) return b;
        return ucln(b, a % b);
    }
}

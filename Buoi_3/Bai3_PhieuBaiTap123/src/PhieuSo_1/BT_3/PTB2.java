package PhieuSo_1.BT_3;

import java.util.Scanner;

public class PTB2 {

    private float a, b, c;

    public PTB2() {
    }

    public PTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Nhập hệ số bậc 2, a = ");
        a = scanner.nextFloat();
        System.out.print("  Nhập hệ số bậc 1, b = ");
        b = scanner.nextFloat();
        System.out.print("  Nhập hệ số tự do, c = ");
        c = scanner.nextFloat();
    }

    public void xuat() {
        System.out.println( a + "x2 + " + b + "x + " + c);
    }
}

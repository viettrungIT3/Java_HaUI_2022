package BaiTap_3;

import java.util.Random;
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

//        Random random = new Random();
//        a = random.nextFloat() + 1;
//        b = random.nextFloat() + 1;
//        c = random.nextFloat() + 1;
    }

    public String giaiPTB2(float a, float b, float c) {
        String str = "";
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                str = "Phương trình vô nghiệm!";
            } else {
               str = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
            return str;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            str = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            str = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            str = "Phương trình vô nghiệm!";
        }

        return str;
    }

    public static void tieuDe() {
        System.out.println("===========================");
        System.out.printf("%-4s|   %-40s|   %-40s", "STT", "Phương trình bậc 2", "Kết quả");
        System.out.println();
    }

    public String inPTB2() {
        return "" + a + "x2 + " + b + "x + " + c + " = 0";
    }

    public void xuatPTB2() {
        System.out.printf("%-40s|   %-40s", inPTB2(), giaiPTB2(a, b, c));
        System.out.println();
    }
}

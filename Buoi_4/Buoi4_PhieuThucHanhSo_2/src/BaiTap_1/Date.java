package BaiTap_1;

import java.util.Scanner;

public class Date {

    private int d, m, y;

    public Date() {
    }

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return d + "/" + m + "/" + y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Enter year:");
        y = scanner.nextInt();
        do {
            System.out.print("  Enter month:");
            m = scanner.nextInt();
        } while (m <= 0 || m > 12);

        int[] maxDayOnMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
            maxDayOnMonth[1] = 29;
        }
        do {
            System.out.print("  Enter day:");
            d = scanner.nextInt();
        } while ( d <= 0 || d > maxDayOnMonth[m-1]);

    }
}

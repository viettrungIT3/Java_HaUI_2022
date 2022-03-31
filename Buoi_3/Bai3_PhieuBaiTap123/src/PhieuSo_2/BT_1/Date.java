package PhieuSo_2.BT_1;

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
        System.out.print("  Enter day:"); d = scanner.nextInt();
        System.out.print("  Enter month:"); m = scanner.nextInt();
        System.out.print("  Enter year:"); y = scanner.nextInt();
    }
}

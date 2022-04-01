package BaiTap_1;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HCN {

    private static float dai, rong;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HCN h = new HCN();
        h.nhap();
        HCN.inTieuDe();
        h.xuat();

    }

    private static double tinhDienTich() {
        return dai*rong;
    }

    private static double tinhChuVi() {
        return  ( dai + rong) * 2;
    }

    public void nhap() {
        Random random = new Random();

        dai = random.nextFloat() + 10;
        rong = random.nextFloat() + 10;
    }

    public static void inTieuDe() {
        System.out.printf("%15s%15s%15s%15s%n",
                "Chiều dài ", "Chiều rộng ", " Chu vi", "Diện tich");
    }

    public void xuat() {
//         In kết quả
        DecimalFormat d = new DecimalFormat(("###,###.0#"));
        System.out.printf("%15.1f%15.1f%15s%15s%n", dai, rong, d.format(tinhChuVi()), d.format(tinhDienTich()));
    }
}

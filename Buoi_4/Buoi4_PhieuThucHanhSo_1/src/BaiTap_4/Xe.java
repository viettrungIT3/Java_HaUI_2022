package BaiTap_4;

import java.util.Scanner;

public class Xe {

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;

    public Xe() {
    }

    public Xe(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float getThuePhaiNop() {
        float thue = triGia;
        if (dungTich < 100) {
            thue *= 0.01;
        }
         else if (dungTich < 200) {
            thue *= 0.03;
        }
        else {
            thue *= 0.05;
        }
        return thue;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin xe");
        System.out.printf("- Nhập tên chủ xe: ");     tenChuXe = scanner.nextLine();
        System.out.printf("- Nhập loại xe: ");        loaiXe = scanner.nextLine();
        System.out.printf("- Nhập dung tích: ");       dungTich = scanner.nextInt();
        System.out.printf("- Nhập trị giá xe: ");      triGia = scanner.nextFloat();   scanner.nextLine();
    }

    public void xuat() {
        System.out.printf("%-30s %-15s %10s %20.2f %20.2f", tenChuXe, loaiXe, dungTich, triGia, getThuePhaiNop());
        System.out.println();
    }
}

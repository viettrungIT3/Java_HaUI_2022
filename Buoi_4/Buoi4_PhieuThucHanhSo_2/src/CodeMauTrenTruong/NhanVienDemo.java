package CodeMauTrenTruong;

import javax.swing.*;

public class NhanVienDemo {
    public static void main(String[] args) {
        NgayThang ngaySinh = new NgayThang(7, 24, 1991);
        NgayThang ngayVaoLam = new NgayThang(3, 12, 1998);
        NhanVien nv = new NhanVien("Vu thi", "Lan anh",
                ngaySinh,
                ngayVaoLam);
        //gọi hàm hiển thị message dialog trong thư viện
        JOptionPane.showMessageDialog(null, nv.toString(),
                "minh họa lớp Employee", JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0); //thoát khỏi chương trình
    }
}

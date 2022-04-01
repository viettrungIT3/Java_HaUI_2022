package CodeMauTrenTruong;

public class NgayThang {

    private final int thang; // 1-12
    private final int ngay; // 1-31 based on month
    private final int nam; // any year

    public NgayThang(int thang1, int ngay1, int nam1) {
        if (thang1 > 0 && thang1 <= 12) // tháng hợp lệ
            this.thang = thang1;
        else {
            this.thang = 1;
            System.out.println("Tháng " + thang1 + " không hợp lệ. đặt lại tháng =1.");
        }
        nam = nam1; // could validate year
        ngay = checkDay(ngay1); // kiểm tra ngày hợp lệ
        System.out.println("in thông tin ngày tháng " +
                this
        );
    }

    private int checkDay(int ngayKiemTra) {
        int[]
                ngayTrongThang = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
// kiểm tra nếu ngày tháng hợp lệ
        if (ngayKiemTra > 0 && ngayKiemTra <= ngayTrongThang
                [thang])
            return ngayKiemTra;
        else if (((thang == 2) && (ngayKiemTra == 29)) &&
                ((nam % 400 == 0) || ((nam % 4 == 0) && (nam %
                        100 != 0))))
            return ngayKiemTra;
        else {
            System.out.println("ngày " + ngayKiemTra + " không hợp lệ, đặt lại =1.");
            return 1;
        }
    } //end of checkDay()

    //ghi đè phương thức toString để mô tả tháng/ngày/năm
    public String toString() {
        return thang + "/" +
                ngay + "/" + nam;
    }
}// end of calss NgayThang


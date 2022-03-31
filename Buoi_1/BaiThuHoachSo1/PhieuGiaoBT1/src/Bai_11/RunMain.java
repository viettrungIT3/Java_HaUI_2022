package Bai_11;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) { //Khai báo hàm main
        int[][] number = new int[2][3]; //Khởi tạo mảng hai chiều kiểu int có 2 cột, 3 hàng
        Scanner sc = new Scanner(System.in); //Khai báo đối tượng sc thuộc lớp Scanner để nhập

        System.out.println("Nhap mang hai chieu:"); //Câu lệnh in ra màn hình
        for (int i = 0; i < number.length; i++) //vòng lặp for duyệt các cột của mảng number
            for (int j = 0; j < number[i].length; j++) {  //vòng lặp for duyệt các hàng của mảng
                System.out.println("number[" + i + "][" + j + "]=");//Câu lệnh in ra màn hình
                number[i][j] = sc.nextInt(); //Nhập giá trị cho phần tử cột i hàng j
            }
        System.out.println("Mang hai chieu vua nhap:"); //Câu lệnh in ra màn hình
        System.out.println(Arrays.deepToString(number)); //Câu hiển thị mảng number lên màn hình
        int max = 0; //Khởi tạo biến max có giá trị bằng 0
        for (int[] row : number) //vòng lặp for duyệt các cột của mảng number
            for (int value : row) //vòng lặp for duyệt các hàng của mảng
                if (SNT(value) && value > max) //Nếu giá trị của mảng là SNT và lớn hơn max
                    max = value; //giá trị của max được gán bằng value
        System.out.println("SNT lon nhat trong mang la: " + max); //In ra màn hình
    }

    static boolean SNT(int n) {//Khai báo hàm SNT trả về giá trị kiểu boolean có tham số là n
        int dem = 0; //Khởi tạo biến dem kiểu int có giá trị 0
        if (n == 1) return false; //nếu n bằng 1 trả về giá trị false
        if (n == 2) return true; //nếu n bằng 2 trả về giá trị true
        for (int i = 2; i <= Math.sqrt(n); i++) {// vòng lặp cho i chạy từ 2 đến căn bậc hai của n
            if (n % i == 0) { // nếu số dư của n chia cho i bằng 0
                dem++;//tăng giá trị biến dem lên 1 đơn vị
            }
        }
        //nếu dem bằng 0
        // trả về giá trị false
        return dem == 0;// trả về giá trị true
    }

}

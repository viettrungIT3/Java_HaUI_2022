package Bai_12;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) { //Khai báo hàm main
        int[][] a1 = new int[2][3]; //Khởi tạo mảng hai chiều kiểu int có 2 cột, 3 hàng
        int[][] a2 = new int[3][2]; //Khởi tạo mảng hai chiều kiểu int có 3 cột, 2 hàng
        Nhap(a1); //Nhập mảng a1
        Nhap(a2); //Nhập mảng a2
        int m1 = a1.length; //Khởi tạo m1 gán bằng giá trị số cột a1
        int m2 = a2.length; //Khởi tạo m2 gán bằng giá trị số cột a2
        int n2 = a2[0].length; //Khởi tạo n1 gán bằng giá trị số hàng a1
        int n1 = a1[0].length; //Khởi tạo n2 gán bằng giá trị số hàng a2

        if (n1 == m2) {// nếu n1 bằng m2
            int[][] a3 = new int[m1][n2]; //Khởi tạo mảng hai chiều kiểu int có m1 cột, n2 hàng
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    a3[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        a3[i][j] = a3[i][j] + a1[i][k] * a2[k][j];
                    }
                }
            }
            System.out.println("Tich hai ma tran vua nhap: "); //In ra màn hình
            System.out.println(Arrays.deepToString(a3)); //In ra màn hình mảng hai chiều a3
        } else System.out.println("Khong nhan duoc"); //In ra màn hình

    }

    static void Nhap(int[][] number) { //Khai báo hàm Nhập có tham số là mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang hai chieu:");
        for (int i = 0; i < number.length; i++)
            for (int j = 0; j < number[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]=");
                number[i][j] = sc.nextInt();
            }
        System.out.println("Mang hai chieu vua nhap:");
        System.out.println(Arrays.deepToString(number));
    }
}


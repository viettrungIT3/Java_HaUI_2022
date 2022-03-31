package Bai_13;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {//Khai báo hàm main
        int[] arr = new int[5];//Khai báo mảng 1 chiều kiểu nguyên với 5 phần tử
        Scanner sc = new Scanner(System.in); //Khai báo đối tượng sc thuộc lớp Scanner để nhập

        System.out.println("Nhap mang:");//In ra màn hình
        //Nhập các giá trị cho mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + (i + 1) + "]=");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap:" + Arrays.toString(arr));//In ra màn hình

        int[] arrCopy = arr.clone();//Sao chép mảng
        System.out.println("Mang copy:" + Arrays.toString(arrCopy));//In ra màn hình
    }
}


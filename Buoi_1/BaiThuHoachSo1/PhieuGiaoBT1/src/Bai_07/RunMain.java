package Bai_07;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử(n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.printf("Nhập lần lượt " + n + " số nguyên vào mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần tìm: ");
        int x = scanner.nextInt();

        if (search(arr, n, x) == -1)
            System.out.println("Giá trị " + x + " không có trong mảng.");
        else
            System.out.println("Vị trí giá trị " + x + " xuất hiện đầu tiên trong mảng là: " + (search(arr, n, x) + 1));
    }

    public static int search(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == x)
                return i;   // Trả về chỉ số khi tìm thấy

        return -1;  // Nếu không tìm thấy trả về -1. Vì chỉ số mảng >= 0
    }
}

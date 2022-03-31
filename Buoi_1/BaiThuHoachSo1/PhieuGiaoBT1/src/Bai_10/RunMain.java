package Bai_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RunMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //Vòng lặp in ra 10 số ngẫu nhiên
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(100) + 1;
            list.add(ranNum);
        }

        System.out.println("Mảng ban đầu: ");
        list.forEach(System.out::println);  // Hàm hiển thị mảng

        List<Integer> list1 = new ArrayList<>();    // Khởi tạo mảng list1 để lưu SNT
        for ( int item : list) {
            if (isPrime(item))
                list1.add(item);    // thêm các số nguyên tố vào mang list1
        }

        list1.sort(((o1, o2) -> (o1 -o2)));     // Sắp xếp các số nguyên tố trong list1


        List<Integer> list2 = list1;    // gán list -> list 2
        for ( int item : list) {
            if (!isPrime(item))
                list2.add(item);    // thêm các còn lại vào  list2
        }

        System.out.println("List 2: ");
        list1.forEach(System.out::println);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

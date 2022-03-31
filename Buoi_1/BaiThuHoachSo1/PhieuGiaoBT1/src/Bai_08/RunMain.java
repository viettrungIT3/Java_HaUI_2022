package Bai_08;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Ý tưởng 1:
//        // Khởi tạo mảng sắp xếp tăng
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.print("Nhập giá trị mới: ");
//        int x = scanner.nextInt();
//
//        arr = insert(arr, x);
//
//        System.out.printf("Hiển thị mảng: ");
//        for (int i = 0; i < args.length; i++) {
//            System.out.print( arr[i] + " ");
//        }

        // Ý tưởng 2: Sử dụng ArrayList và các phương thức của nó
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(9);

        System.out.print("Mảng ban đầu: ");
        System.out.println(integerArrayList);   // Hiển thị mảng

        System.out.print("Nhập giá trị mới muốn chèn vào mang: ");
        int x = scanner.nextInt();  // Nhập x

        integerArrayList.add(x);    // thêm x vào cuối mảng

        integerArrayList.sort((o1, o2) -> o1 - o2);     // Sử dụng .sort để sắp xếp mảng

        System.out.print("Mảng sau khi chèn: ");
        System.out.println(integerArrayList);




    }

    /** Ý tưởng 1:
     * chèn phần tử vào mảng số nguyên tăng dần
     * sau khi chèn mảng vẫn duy trì thứ tự tăng dần
     */
    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }
}

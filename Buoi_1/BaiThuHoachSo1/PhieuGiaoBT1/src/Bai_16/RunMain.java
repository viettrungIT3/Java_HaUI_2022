package Bai_16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str = "   Hello   Wolrd!    ";
        System.out.println("Chuỗi ban đầu: " + str);
        str = str.trim();   // xóa khoảng trắng đầu và cuối
        str = str.replaceAll("\\s\\s+", " ");   // xóa khoảng trắng thưag

        List<String> words = new ArrayList<>(Arrays.asList(str.split("\\s"))) ;//tach chuoi dua tren khoang trang -> chuyển sang list

        System.out.println("Số từ trong chuổi: " + words.size());
    }
}



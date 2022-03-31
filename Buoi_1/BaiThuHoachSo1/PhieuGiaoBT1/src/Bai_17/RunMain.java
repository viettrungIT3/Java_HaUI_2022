package Bai_17;

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

        String[] words = str.split(" ");   //Tách chuỗi thành từng từ nhỏ lưu vào mảng
        String strNew = "";

        for ( String word : words) {
            word = word.replaceFirst(word.charAt(0) + "", (word.charAt(0) + "").toUpperCase());   // Thay thế ký tự đầu tiên từ chữ thường sang chữ hoa
            strNew += word + " ";
        }

        strNew = strNew.trim();
        System.out.println("Chuỗi sau khi chuẩn hóa: " + strNew);

    }
}

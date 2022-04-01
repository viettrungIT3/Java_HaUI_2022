package BaiTap_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Circle> list = new ArrayList<>();

        while (true) {
            Circle circle = new Circle();
            System.out.println("Input circle: ");
            circle.input();

            list.add(circle);

            String k;
            System.out.printf("Do you continue(Y/N)? ");
            k = scanner.next();
            if (k.equals("N") || k.equals("n"))
                break;
        }

        Circle.title();
        for ( Circle circle : list ) {
            System.out.printf("%5s ", (list.indexOf(circle) + 1));
            circle.display();
            System.out.println();
        }
    }
}

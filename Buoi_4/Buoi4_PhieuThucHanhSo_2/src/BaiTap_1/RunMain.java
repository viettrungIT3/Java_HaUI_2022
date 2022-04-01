package BaiTap_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        while (true) {
            System.out.println("===MENU===");
            System.out.println("a. Enter Employee information.");
            System.out.println("b. Display Employee information.");
            System.out.println("c. Exit.");

            String k;
            System.out.printf("You will choose: ");    k = scanner.next();
            switch (k) {
                case "a":
                    Employee employee = new Employee();
                    employee.input();
                    employeeList.add(employee);
                    break;
                case "b":
                    System.out.printf("%-15s%-10s%15s%15s", "Last name", "First name", "Birthday", "Working Day");
                    System.out.println();
                    for ( Employee e: employeeList) {
                        e.output();
                    }
                    break;
                case "c":
                    System.exit(0);
            }
        }
    }
}

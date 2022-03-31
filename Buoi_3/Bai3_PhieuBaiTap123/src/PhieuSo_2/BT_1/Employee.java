package PhieuSo_2.BT_1;

import java.util.Scanner;

public class Employee {

    private String lastName;
    private String firstName;
    private Date birthday = new Date();
    private Date workingDay = new Date();

    public Employee() {
    }

    public Employee(String lastName, String firstName, Date birthday, Date workingDay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.workingDay = workingDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(Date workingDay) {
        this.workingDay = workingDay;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name:");      lastName = scanner.nextLine();
        System.out.print("Enter first name:");     firstName = scanner.nextLine();
        System.out.println("Enter birthday:");       birthday.input();
        System.out.println("Enter working day:");    workingDay.input();
    }

    public void output() {
        System.out.printf("%-15s%-10s%15s%15s", lastName, firstName, birthday, workingDay);
        System.out.println();
    }
}

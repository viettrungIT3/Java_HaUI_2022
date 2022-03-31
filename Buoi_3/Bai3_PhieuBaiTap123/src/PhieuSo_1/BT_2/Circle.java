package PhieuSo_1.BT_2;

import java.util.Scanner;

public class Circle {
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("  Input radius: ");
        setRadius(scanner.nextFloat());
    }

    public void display() {
        System.out.printf("%15.2f %15.2f %15.2f", radius, getPerimeter(), getArea());
    }
}

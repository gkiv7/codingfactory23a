package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a;
        double b;
        double c;
        double triangle = 0.0;

        System.out.println("Please provide a, b, c:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        triangle = Math.abs(a * a - (b * b + c * c));

        if (triangle <= EPSILON) {
            System.out.println("The triangle is a right triangle");
        } else {
            System.out.println("The triangle is not a right triangle");
        }
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AbsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide a number:");
        num = scanner.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.println("Abs: " + abs);
    }
}

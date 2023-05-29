package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AverageApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        int count = 0;
        int avg = 0;

        System.out.println("Please provide total grade and count of courses:");
        grade = scanner.nextInt();
        count = scanner.nextInt();

        if (count <= 0 || grade < 0) {
            System.out.println("Invalid Count or Invalid Grade!");
            System.exit(1);
        }

//        if (grade < 0) {
//            System.out.println("Invalid Grade!");
//            System.exit(1);
//        }

        avg = grade / count;

        if (avg > 10) {
            System.out.println("Invalid Average!");
            System.exit(1);
        }
        if (avg >=9) {
            System.out.println("Excellent!");
        } else if (avg >=7) {
            System.out.println("Very Good!");
        } else if (avg >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }

    }
}

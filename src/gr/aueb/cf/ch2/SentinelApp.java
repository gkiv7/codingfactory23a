package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number:");
        num = scanner.nextInt();

        while (num != 0) {
//            System.out.println(num);
            iterations++;
            System.out.println("Please provide a number:");
            num = scanner.nextInt();
        }
        System.out.printf("%d iterations", iterations);
    }
}

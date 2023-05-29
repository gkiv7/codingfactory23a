package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό n
 * (n!) με τη μέθοδο facto()
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int n;

        System.out.println("Please provide a number:");
        n = scanner.nextInt();

        result = facto(n);
        System.out.println(result);
    }

    public static int facto(int num) {
        int facto = 1;

        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }
}

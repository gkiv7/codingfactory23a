package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int n;
        int result = 0;

        System.out.println("Please provide 2 numbers:");
        a = scanner.nextInt();
        n = scanner.nextInt();

        result = power(a, n);

        System.out.println(result);
    }

    private static int power(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}

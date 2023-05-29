package gr.aueb.cf.ch4;

import java.util.Scanner;

public class RandomFindSecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretKey = (int) (Math.random() * 10)  + 1;
        int num;
        boolean found = false;

        System.out.println("Secret key: " + secretKey);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess:");
            num = scanner.nextInt();

            if (num == secretKey) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries, play again!");
            System.exit(1);
        }

        System.out.println("Success! Play again!");
    }
}

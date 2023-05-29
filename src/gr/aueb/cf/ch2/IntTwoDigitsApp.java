package gr.aueb.cf.ch2;

import java.util.Date;
import java.util.Scanner;

/**
 * Ο χρήστης δίνει έναν ακέραιο
 * και βρίσκουμε το άθροισμα των 2 ψηφίων
 */
public class IntTwoDigitsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumDigits = 0;

        System.out.println("Please insert an integer with 2 digits: ");
        num = scanner.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sumDigits = leftDigit + rightDigit;

        System.out.printf("The sum of the digits of the number:%d is --> %d",num,sumDigits);
    }
}

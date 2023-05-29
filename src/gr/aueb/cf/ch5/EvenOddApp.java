package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένας int είναι
 * άρτιος ή περιττός
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Provide a number:");
        num = scanner.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even? " + isNumEven);
    }

    /**
     *Evaluates an int if it is even or not
     * @param n the number (int) to evaluate.
     * @return  true, if n is even, false otherwise.
     */
    public static boolean isEven(int n) {

        return n % 2 == 0;
    }
}

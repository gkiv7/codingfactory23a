package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts euros to dollars USA
 * it takes an integer from the user(stdin)
 * which represent the amount of euros and
 * convert it to dollars
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int PARITY = 99;
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Give the amount of euros: ");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("The amount of USA dollars from %d euros is: %d dollars and %d cents",inputEuros,usaDollars,usaCents);



    }
}

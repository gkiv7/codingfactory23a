package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζουμε απο το stdin το
 * start-value, end-value, step
 * και εκτυπώνει το πλήθος των
 * επαναλήψεων
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please insert start-value, end-value and step:");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations: " + iterations);


    }
}

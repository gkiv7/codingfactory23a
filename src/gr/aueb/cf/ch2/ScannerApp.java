package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει απο το std input (πληκτρολόγιο)
 * δύο ακεραίους και τους προσθέτει.
 */
public class ScannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Δώσε έναν ακέραιο αριθμό: ");
        int num1 = scanner.nextInt();
        System.out.println("Δώσε εναν ακέραιο αριθμό: ");
        int num2 = scanner.nextInt();
        int result = 0;

        result = num1 + num2;
        System.out.println(result);
    }
}

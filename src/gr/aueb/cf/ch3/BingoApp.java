package gr.aueb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please provide a number:");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}

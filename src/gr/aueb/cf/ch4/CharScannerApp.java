package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CharScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        System.out.println("Please insert a character:");
        inputChar = scanner.next().charAt(0);

        System.out.println("Char: " + inputChar);
    }
}
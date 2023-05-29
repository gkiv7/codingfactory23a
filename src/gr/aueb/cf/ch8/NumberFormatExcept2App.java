package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExcept2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int inputNum;

            System.out.println("Please insert an int:");
            inputStr = scanner.nextLine();

            if (isInt(inputStr)) {
                inputNum = Integer.parseInt(inputStr);
                System.out.println("Input num: " + inputNum);
            } else {
                System.out.println("Please ");
            }
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int inputNum;

        try {
        System.out.println("Please insert an int:");
        inputStr = scanner.nextLine();
        inputNum = Integer.parseInt(inputStr);
        System.out.println("Input num: " + inputNum);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("Error in input");
        }
    }
}

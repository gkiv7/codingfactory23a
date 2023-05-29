package gr.aueb.cf.ch8;

import javax.swing.*;
import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Please insert:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            System.out.println("Please ..");
//        }

//        System.out.println(result);

        if (num2 == 0) {
            System.out.println("Please..");
            System.exit(1);
        }

        result = num1 / num2;
    }
}

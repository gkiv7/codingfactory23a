package gr.aueb.cf.ch7;

import java.util.Scanner;

public class TypecastApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.print("Please insert a num(int):");
        lexeme = scanner.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}

package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 7;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        result2 = num1++; // result2 -> 12, num1 -> 13
        System.out.println(result2);
        result2 = ++num2; // num2 -> 6, result2 -> 6


        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = (num1 + num2) * (num2 - 5 ) / (num1 % 4);

        System.out.println("Το άθροισμα : " + sum);
        System.out.println("Η αφαίρεση : " + sub);
        System.out.println("Ο πολλαπλασιασμός : " + mul);
        System.out.println("Η διαίρεση : " + div);
        System.out.println("Το υπόλοιπο : " + mod);
        System.out.println("Το αποτέλεσμα : " + result1 + "," + result2);
    }
}

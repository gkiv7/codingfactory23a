package gr.aueb.cf.ch5;

/**
 * float / Double expressions
 *
 */
public class Expression {

    public static void main(String[] args) {
        double num1 = 12545435.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;
        String a = new String("Java");

        result = num1 / num2;  //6.25
        mod = num1 % num2;     //0.5
        System.out.println(a);
        System.out.printf("Result = %,.2f, mod = %,.2f", result, mod);
    }
}

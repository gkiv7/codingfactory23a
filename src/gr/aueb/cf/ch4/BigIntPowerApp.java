package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^n με BigInteger
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1"); //BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two integers, base and power:");
        a = BigInteger.valueOf(scanner.nextInt()); // kanei typecast apo ton primitive sth class Big integer
        n = BigInteger.valueOf(scanner.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %,d", a, n, result);




    }
}
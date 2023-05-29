package gr.aueb.cf.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static float power (float a, float b) {
        if (b < 0) {
            return 1 / a * power(a, b-1);
        }

        if (b == 0)  return 1;

        return a * power(a, b-1);
        }
    }


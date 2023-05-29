package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsDemo {
    /**
     * Μετατρέπει δευτερόλεπτα σε Days,
     * hours, minutes
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAY_SEC = 24 * 3600;
        final int HOUR_SEC = 3600;
        final int MINUTES_SEC = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int remainingSec = 0;

        System.out.println("Please insert the seconds: ");
        inputSeconds = scanner.nextInt();

        remainingSec = inputSeconds;
        days = inputSeconds / DAY_SEC;
        remainingSec = remainingSec % DAY_SEC;

        hours = remainingSec / HOUR_SEC;
        remainingSec %= HOUR_SEC;

        minutes = remainingSec / MINUTES_SEC;
        remainingSec %= MINUTES_SEC;

        seconds = remainingSec;

        System.out.printf("%,d seconds are: %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days,hours,minutes,seconds);


    }
}

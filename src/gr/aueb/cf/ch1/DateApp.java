package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month,year;

        System.out.println("Give 1st integer: ");
        System.out.println("Give 2st integer: ");
        System.out.println("Give 3st integer: ");

        day = scanner.nextInt();
       while (day < 0 | day > 31) {
            System.out.println("The proper integer for a day is 1-31!!! Give a proper integer:");
            day = scanner.nextInt();
        }
        month = scanner.nextInt();


       while (month < 0 | month > 12) {
           System.out.println("The proper integer for a month is 1-12!!! Give a proper integerL ");
           month = scanner.nextInt();
       }
        year = scanner.nextInt();
        while (year < 0) {
            System.out.println("Year can't be negative number!!!Give a proper integer: ");
            year = scanner.nextInt();
        }
        year = year % 100;

        System.out.printf("%02d/%02d/%d",day,month,year);



    }
}

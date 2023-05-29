package gr.aueb.cf.ch1;

/**
 * Add 2 integers
 * and display the result
 * to the stdout
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 =  2147483645;
        int num2 = 4;
        int sum = 0;
        int i = 5 / 9;

        sum = num1 + num2;

        System.out.println("Το αποτέλεσμα των " + num1 + " + " + num2 + " = " + sum);
        System.out.printf("Το αποτέλεσμα των %d + %d = %d",num1,num2,sum);
    }

}

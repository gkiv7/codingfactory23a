package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει
 * ένα ποτάμι. Ο frog έστω ότι βρίσκεται
 * στη θέση X και θέλει να φτάσει στη θέση Y
 * (ή σε θέση μεγαλύτερη του Y). Ο frog jumps
 * a fixed distance D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο frog
 * πρέπει να κάνει ώστε να φτάσει στον στόχο του
 * (ή να τον ξεπεράσει)
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30
 *
 * τότε ο frog θα χρειαστεί 3 jumps, γιατί:
 * starts at 10, κι μετά το 1ο jump πάει στη θέση 10+30=40
 * Στο 2ο jump παέι 40+30=70
 * Στο 3ο jump πάει 70+30=100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int d;
        int jumps = 0;

        System.out.println("Please insert x, y, d:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        d = scanner.nextInt();

        jumps = (int) Math.ceil((double) (y - x) / d);

//        for (int i = x; i < y; i += d) {
//            jumps++;
//        }
        System.out.printf("The small frog needs %d jumps to reach or overcome the distance of %d meters", jumps, d);
    }
}

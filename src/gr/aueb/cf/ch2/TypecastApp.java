package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {

        int num1 = 10;
        long num2 = 20L;

        num1 = (int) num2; // Δεν είναι καλή μέθοδος γιατί μπορεί να χάσουμε δεδομένα

    }
}

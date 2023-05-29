package gr.aueb.cf.ch8;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates the usage of Exceptions.
 */
public class ExceptApp {

    public static void main(String[] args)  {
        int ch;
        int[] arr = new int[10];

        try {
            ch = getNextChar();
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int getNextChar() throws IOException{
       int ch = ' ';

       try {
            ch =  System.in.read();//returns the ordinal number
        } catch (IOException e) {
            // 1. Rollback
            // 2. Logging
            e.printStackTrace();

            // Rethrow
            throw e;
        }

        return ch;
    }
}

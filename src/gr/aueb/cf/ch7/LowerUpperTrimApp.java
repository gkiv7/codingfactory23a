package gr.aueb.cf.ch7;

import java.util.Locale;

/**
 * Transforms strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "  Athens Uni";
        String s2 = "";
        String lowercase;
        String uppercase;
        String trimmed;

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }

}

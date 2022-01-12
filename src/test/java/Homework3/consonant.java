package Homework3;

import org.testng.annotations.Test;

import java.util.Locale;

public class consonant {
    @Test
    public void letter() {
        check("English is a West Germanic language of the Indo-European language family, " +
                "originally spoken by the inhabitants of early medieval England.[3][4][5] " +
                "It is named after Anglia, a peninsula on the Baltic Sea (not to be confused with East Anglia)," +
                " and the Angles, one of the ancient Germanic peoples that migrated to the area of Great Britain that later took their name: England." +
                " Living languages most closely related to English include the Low Saxon and Frisian languages," +
                " while English's vocabulary has been significantly influenced by Old Norman French and Latin," +
                " as well as by other Germanic languages, particularly Old Norse (a North Germanic language).");
    }

    public void check(String text) {
        text = text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'q' ||
                    text.charAt(i) == 'w' ||
                    text.charAt(i) == 'r' ||
                    text.charAt(i) == 't' ||
                    text.charAt(i) == 'p' ||
                    text.charAt(i) == 's' ||
                    text.charAt(i) == 'd' ||
                    text.charAt(i) == 'f' ||
                    text.charAt(i) == 'g' ||
                    text.charAt(i) == 'h' ||
                    text.charAt(i) == 'j' ||
                    text.charAt(i) == 'k' ||
                    text.charAt(i) == 'l' ||
                    text.charAt(i) == 'z' ||
                    text.charAt(i) == 'x' ||
                    text.charAt(i) == 'c' ||
                    text.charAt(i) == 'v' ||
                    text.charAt(i) == 'b' ||
                    text.charAt(i) == 'n' ||
                    text.charAt(i) == 'm' ||
                    text.charAt(i) == ',') {
            } else {
                System.out.print(text.charAt(i));
            }
        }
    }
}

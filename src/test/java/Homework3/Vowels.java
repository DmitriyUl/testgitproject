package Homework3;

import org.testng.annotations.Test;

import java.util.Locale;

public class Vowels {
    @Test
    public void vowels() {
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
            if (text.charAt(i) == 'y' ||
                    text.charAt(i) == 'a' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'i' ||
                    text.charAt(i) == 'u') {
            } else {
                System.out.print(text.charAt(i));
            }
        }
    }

}

package HomeWork2;

import org.testng.annotations.Test;

public class Three {
        @Test
    public void check(){
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0)
                System.out.println(k);

        }
    }
}

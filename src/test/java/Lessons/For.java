package Lessons;

import org.testng.annotations.Test;

public class For {
    @Test
    public void test() {
        for (int i = 1; i <= 10; i++) {
            //      System.out.println("1");
            System.out.println("3 * " + i + " = " + 3 * i);
        }
    }

    int d = 4;

    @Test
    public void test2() {
        if (d == 5) {
            for (int d = 1; d <= 10; d++) {
                System.out.println("5 * " + d + " = " + 5 * d);
            }
        } else if (d == 6) {
            for (int d = 1; d <=10; d++ )
            System.out.println("6 * " + d + " = " + 6 * d);
        }
        if (d!=5 && d!=6){
            System.out.println("Введите значение 5 или 6");
        }

    }
    int t=5;
    @Test
    public void tab() {
        if (t < 11) {
            for (int f = 1; f <= 10; f++) {
                System.out.println(t + " * "  + f + " = " + t * f);
            }
        }
        else {
            System.out.println("Введіть значення від 1 до 10 ");

        }

    }
}

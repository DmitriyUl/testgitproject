package HomeWork2;

import org.testng.annotations.Test;

public class Month {
    @Test
    public void check() {
       int x = 12;
            if (x == 1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12) {
                System.out.println("In this month is 31 days");
            }
            if (x == 2) {
                System.out.println("In this month is 28 days expect the leap year in it 29 days");
            }
            if (x == 4 || x==6 || x==9 || x==11) {
                System.out.println("In this month is 30 days");
            }
            else if(1>x || x>12) {
                System.out.println("Enter true value");
            }

    }
}


package HomeWork2;

import org.testng.annotations.Test;

public class Weeks {
    @Test
    public  void  check(){
       int x = 8;
        if (x==1) {
            System.out.println("Monday");
        }
        else if (x==2){
            System.out.println("Tuesday");
        }
        else  if (x==3){
            System.out.println("Wednesday");
        }
        else if (x==4){
            System.out.println("Thursday");
        }
        else if (x==6) {
            System.out.println("Saturday");
        }
        else if (x==7){
            System.out.println("Sunday");
        }
        else if (x<1 || x>7) {
            System.out.println("Enter true value");
        }
   }
}


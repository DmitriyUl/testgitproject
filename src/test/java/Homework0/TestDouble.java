package Homework0;

import org.testng.annotations.Test;

public class TestDouble {
    @Test
    public void go(){
        summa ((double) 3593.3255887126555, (double) 35987.325874262);
        minus ((double) 2458.365598565, (double) 248793.3558743645551);
        mnozh ((double) 4515473.5489222321, (double) 1478235.355974);
        dil ((double) 98754635.3257872, (double) 8147852.369852);

    }
    public void summa(double one, double two){
        System.out.println(one+two);
    }
    public void minus(double one, double two){
        System.out.println(one-two);
    }
    public void mnozh(double one, double two){
        System.out.println(one*two);
    }
    public void dil(double one, double two){
        System.out.println(one/two);
    }

}

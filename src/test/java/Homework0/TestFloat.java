package Homework0;

import org.testng.annotations.Test;

public class TestFloat {
    @Test
    public  void go(){
        summa((float) 3.98, (float) 35.298);
        minus((float) 252.98,(float) 57.2987);
        mnozhennya((float) 248.359, (float) 358.269);
        dilennya((float) 98.347, (float) 873.25478);

    }
    public void summa(float one, float two){
        System.out.println(one+two);
    }
    public void minus(float one, float two){
        System.out.println(one-two);
    }
    public void mnozhennya(float one, float two){
        System.out.println(one*two);
    }
    public void dilennya(float one, float two){
        System.out.println(one/two);
    }

    }


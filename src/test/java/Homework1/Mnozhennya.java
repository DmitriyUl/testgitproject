package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mnozhennya {
    @Test
    public void check(){
        Assert.assertNotEquals(mnozh(5, 7, 8), 20);
    }
    public int mnozh(int first, int second, int three){
        System.out.println("Множення трьох чисел 5*7*8" );
        System.out.println("Результат = " + first * second * three);
        System.out.println("Очікуваний результат false"+"\n");
        return first * second * three;

    }
}

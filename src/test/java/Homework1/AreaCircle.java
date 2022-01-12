package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaCircle {
    @Test
    public void check(){
        Assert.assertTrue(area(5)==78.5);
    }
    public float area(int r){
        System.out.println("Рахуємо площу круга з радіусом 5");
        System.out.println("Площа круга = " +3.14*(5*5)+"\n");
        return (float) (3.14 * (r * r));
    }

}

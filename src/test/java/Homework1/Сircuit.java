package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Сircuit {
    @Test
    public void check(){
        assertEquals(length(3.5), 21.98);
    }

    public double length(double r){
        System.out.println("Рахуємо довжину кола");
        System.out.println("Довжина кола дорівнює " + 2*3.14*r+"\n");
        return 2 * 3.14 * r;

    }
}

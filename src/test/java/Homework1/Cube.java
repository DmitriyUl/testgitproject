package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Cube {
    @Test
    public void check(){
        Assert.assertEquals(VCube(5, 5, 5), 125);
    }

    public int VCube(int a,int b, int c){
        System.out.println("Рахуємо об'єм куба зі сторонами 5 см");
        System.out.println("Об'єм куба дорівнює " + 5*5*5+"\n");
        return a*b*c;
    }
}

package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaSquare {
    @Test
    public void check(){
        Assert.assertEquals(area(25, 25), 625);
    }

    public int area(int one, int two) {
        System.out.println("Рахуємо площу квадрата зі сторонами 25 см.");
        System.out.println("Площа квадрата дорівнює " + 25*25+"\n");
        return one * two;
    }
}

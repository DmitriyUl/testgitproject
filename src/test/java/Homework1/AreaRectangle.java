package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaRectangle {
    @Test
    public void check(){
        Assert.assertEquals(area(15, 25), 375);
    }

    public int area(int one, int two) {
        System.out.println("Рахуємо площу прямокутника зі сторонами 15 і 25");
        System.out.println("Площа прямокутника = " + 15*25+"\n");
        return one * two;
    }
}
package Lessons;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringActions {
      @Test
    public void check(){
          Assert.assertTrue(summa(15,25) == 40);
          Assert.assertTrue(summa(15,35) == 50);
          Assert.assertTrue(summa(25,25) == 50);
          Assert.assertTrue(summa(15,46) == 61);
          Assert.assertTrue(summa(10,25) == 35);


      }
      public int summa(int one, int two) {
          return one + two;
      }
}

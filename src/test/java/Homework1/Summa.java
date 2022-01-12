package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Summa {

    int Q = 5;
    int W = 6;
    int S = 4;
    int Asd;

    @Test
    public void check(){
      Summa(Q,W,S);
      System.out.println(Asd);
      Assert.assertEquals(Asd , 15);
    }

    public void Summa(int pervorChislo , int b, int three){
        Asd = pervorChislo + b +three;
        System.out.print("Сума троьх чисел "  );
        System.out.print(Q);
        System.out.print("+");
        System.out.print("+");
        System.out.println(S);
        System.out.println("Результат = " + Asd +"\n");
    }
}

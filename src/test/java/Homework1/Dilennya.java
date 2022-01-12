package Homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dilennya {

    int A = 128;
    int B = 64;
    int C;

    @Test
    public void check(){
        dil(A,B);
        Assert.assertEquals(C,2);

    }

    public void dil(int one, int two) {
        C=A/B;
        System.out.print("Ділення двох чисел "  );
        System.out.print(A);
        System.out.print("/");
        System.out.println(B);
        System.out.println("Результат = " + C +"\n");
    }

}

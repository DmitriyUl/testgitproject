package Homework0;

import org.testng.annotations.Test;

public class TestLong {
    @Test
    public void calc(){
        minus(284269841236556L,555265412124L);
        mnozhennya(5125412516L,22684159854L);
        dilennya(2522226392652555L,5222652254121L);
        procent(52515142854150L,26425415145L);
        summa(2541545645155L,6625284555L);
    }
    public void  minus(long first, long second){
        System.out.println(first - second);
    }
    public void  mnozhennya(long first, long second){
        System.out.println(first * second);
    }
    public void  dilennya(long first, long second){
        System.out.println(first / second);
    }
    public void  procent(long first, long second){
        System.out.println(first % second);
    }
    public void summa(long first, long second){
        System.out.println(first + second);
    }

}


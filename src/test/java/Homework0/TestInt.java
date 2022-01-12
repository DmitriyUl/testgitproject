package Homework0;

import org.testng.annotations.Test;

public class TestInt {
    @Test
    public void calc(){
        minus(565887,246874);
        mnozhennya(557986,2254);
        dilennya(2000555,5555);
        procent(3987,58);
        summa(2564125,64559585);
    }
    public void  minus(int first, int second){
        System.out.println(first - second);
    }
    public void  mnozhennya(int first, int second){
        System.out.println(first * second);
    }
    public void  dilennya(int first, int second){
        System.out.println(first / second);
    }
    public void  procent(int first, int second){
        System.out.println(first % second);
    }
    public void summa(int first, int second){
        System.out.println(first + second);
    }

}

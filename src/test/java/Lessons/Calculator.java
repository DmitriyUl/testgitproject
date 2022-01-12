package Lessons;

import org.testng.annotations.Test;

public class Calculator {
    @Test
    public void calc(){
        minus(56,24);
        mnozhennya(56,24);
        dilennya(25,5);
        procent(50,2);
        summa(25,65);
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

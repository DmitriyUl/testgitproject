package Homework0;

import org.testng.annotations.Test;

public class TestByte {
    @Test
    public void go(){
        summa((byte) 5,(byte) 25);
        minus((byte) 28, (byte) 15);
        mnozhennya((byte) 15, (byte) 4);
        dilennya((byte) 64, (byte) 8);
        ostacha((byte) 29, (byte) 5);
    }
    public void summa(byte one, byte two){
        System.out.println(one+two);
    }
    public void minus(byte one, byte two){
        System.out.println(one-two);
    }
    public void mnozhennya(byte one, byte two){
        System.out.println(one*two);
    }
    public void dilennya(byte one, byte two){
        System.out.println(one/two);
    }
    public void ostacha(byte one, byte two){
        System.out.println(one%two);
    }
}

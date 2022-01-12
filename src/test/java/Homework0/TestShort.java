package Homework0;

import org.testng.annotations.Test;

public class TestShort {
    @Test
    public void Short1(){
        summa((short) 5,(short) 25);
        minus((short) 28, (short) 15);
        mnozhennya((short) 15, (short) 4);
        dilennya((short) 64, (short) 8);
        ostacha((short) 27, (short) 5);
    }
        public void minus(short a, short b){
            System.out.println(a-b);
    }
        public void summa(short a, short b){
            System.out.println(a+b);
    }
        public void dilennya(short a, short b) {
            System.out.println(a / b);
    }
        public void mnozhennya(short a, short b) {
            System.out.println(a * b);
    }
        public void ostacha(short a, short b) {
            System.out.println(a % b);
    }
}

package Lessons;

import org.testng.annotations.Test;

public class FizzBuzz {
    @Test
    public void check() {
        doFizzBuzz(45);
    }

    public void doFizzBuzz(int num) {
        for (int i = num; i >= 0; i--){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Lessons.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    @Test
    public void check2() {
        doFizzBuzza(25);
        doFizzBuzza(98);
        doFizzBuzza(57);
    }

    public void doFizzBuzza(int num) {
        for (int i = 1; i <= num; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Lessons.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}



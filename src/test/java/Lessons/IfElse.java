package Lessons;

import org.testng.annotations.Test;

public class IfElse<x> {
    @Test
    public void test() {
        int w = 10, q = 15;

        if (w == q) {
            System.out.println("Верно");

        } else {
            System.out.println("Не верно");
        }
    }


        int a = 5;
        int b = 6;


        @Test
        public void check() {
            test(a, b);

        }

        public void test(int one, int two) {
            if (a == b) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        int age = 22;
        int from = 18;
        int after = 55;

        @Test
        public void work() {
            test2(age, from, after);
        }

        public void test2(int one, int two, int three) {
            if (from > age || age > after) {
                System.out.println("Не дозволено працевлаштування до 18 та після 55 років");
            } else {
                System.out.println("Дозволено працевлаштування");
            }

        }

        int ageAlc = 17;
        int eighteen = 18;

        @Test
        public void alc() {
            test3(ageAlc, eighteen);

        }

        public void test3(int one, int two) {
            if (eighteen > ageAlc) {
                ;
                System.out.println("Заборонено продаж алкогольних напоїв до 18 років");
            } else {
                System.out.println("Продаж дозволено");
            }
        }

        String login = "Vasya1";
        String password = "12345";

        @Test
        public void enter() {
            test4(login, password);
        }

        public void test4(String login, String password) {
            if (login == "Vasya" && password == "12345") {
                System.out.println("Вхід схвалено");
            }
            else {
                System.out.println("Введіть правильний логін чи пароль");
            }
        }

        int x = 7;

    @Test
            public void check1(){
            if (x==1) {
                System.out.println("Monday");
            }
            if (x==2){
                System.out.println("Tuesday");
            }
            if (x==3){
                System.out.println("Wednesday");
            }
            if (x==4){
                System.out.println("Thursday");
            }
            if (x==5) {
                System.out.println("Friday");
            }
            if (x==6) {
                System.out.println("Saturday");
            }
            if (x==7){
                System.out.println("Sunday");
            }
            else {
                System.out.println("Enter true value");
            }

        }

}



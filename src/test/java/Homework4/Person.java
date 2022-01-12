package Homework4;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public  void move(){
        System.out.print(fullName + " move. ");
    }
    public void talk(){
        System.out.println(fullName + " talk.");
    }
}
//   Клас Person
//a) поля fullName, age.
//б) методи move() і talk(), у яких просто виводить в консоль повідомлення -"Person рухається" i "Person говорить".
//в) Додайте два конструктори - Person() та Person(fullName, age).
//Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person(), інший – Person (fullName, age).
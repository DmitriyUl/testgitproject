package Homework4;

public class Phone {
    int number;
    String model;
    int weight;


    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void out() {
        System.out.println("Model " + model + " " + number + " " + " weight " + weight);
    }

    public void receiveCall(String name) {
        System.out.print("Телефонує  " + name + " ");

    }

    public int getNumber(int number) {
        System.out.println(number);
        return number;

    }


}
//а) Створіть клас Phone, який містить змінні number, model та weight.
//б) Створіть три екземпляри цього класу.
//в) Виведіть в консоль значення їх змінних.
//г) Додати в клас Phone методи: receiveCall, має один параметр - імя того, хто дзвонить.
//   Виводить в консоль повідомлення “Телефонує {name}”. getNumber – повертає номер телефону.
//   Викликати ці методи кожного з обєктів.


//д) Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу – number,
//   model та weight.
//е) Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних класів – number, model.
//ж) Додати конструктор без параметрів.

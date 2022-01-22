package GetterSetter;

import org.testng.xml.dom.ParentSetter;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat() {

    }
    public String getName() {
        return this.name;
    }

    public void setName() {
        if (name == null){
            System.out.println("Enter name cat");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка! Вес не может быть отрицательным числом!");
        }
    }



}

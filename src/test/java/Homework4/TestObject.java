package Homework4;

import org.testng.annotations.Test;

public class TestObject {
    @Test
    public void check2() {
        Person person = new Person("Petrov", 25);
        person.move();
        person.talk();
    }

    @Test
    public void check3() {
        Person person1 = new Person();
        person1.move();
        person1.talk();
    }

    @Test
    public void checkPhone() {
        Phone phone = new Phone(3310, "Nokia", 300);
        phone.out();
        phone.receiveCall("Petya");
        phone.getNumber(979548865);
    }

    @Test
    public void checkPhone1() {
        Phone phone1 = new Phone(12, "Iphone");
        phone1.out();
        phone1.receiveCall("Dima");
        phone1.getNumber(979418804);
    }

    @Test
    public void checkPhone2() {
        Phone phone2 = new Phone();
        phone2.out();
        phone2.receiveCall("Ihor");
        phone2.getNumber(931429291);
    }

    @Test
    public void checkReader(){
        Reader reader = new Reader("Петров іван Іванович", "h1458", 979859682);
        reader.takeBooks(3,6);
        reader.returnBooks(2,6,3);
    }

}

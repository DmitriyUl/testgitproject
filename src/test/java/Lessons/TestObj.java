package Lessons;

import Homework4.Person;
import org.testng.annotations.Test;

public class TestObj {
    @Test
    public void check() {
        Home home = new Home(150, "Scooll");
        home.ploscha = 1500;
        home.name = "Scooll";
        home.showHome();
        Home homeA = new Home(25, "IT Office");
        homeA.ploscha = 250;
        homeA.name = "IT Office";
        homeA.showHome();
        Home homeB = new Home(10, "Budinok kultyri");
        homeB.ploscha = 100;
        homeB.name = "Budinok kultyri";
        homeB.showHome();
    }

    @Test
    public void check1() {
        Cars car = new Cars("BMW", 5, "black");
        car.showCars();
        Cars car1 = new Cars("AUDI", 2);
        car1.showCars();
        Cars car2 = new Cars("Opel");
        car2.showCars();
        Cars car3 = new Cars();
        car3.showCars();
    }




}

package Homework;

import org.testng.annotations.Test;

public class TestTaxi {
    @Test
    public void checkHowManyTaxiNeed() {
        int people = 200;

        Taxi vasya = new Taxi(2, 4, 1, "Vasya");
        people = people - vasya.calcHowManyNeedTaxi();

        Taxi kolya = new Taxi(1, 6, 1, "Kolya");
        if (people > 0) {
            people = people - kolya.calcHowManyNeedTaxi();
        }

        Taxi petya = new Taxi(3, 2, 1, "Petya");
        if (people > 0) {
            people = people - petya.calcHowManyNeedTaxi();
        }

        Taxi ivan = new Taxi(2, 4, 1, "Ivan");
        if (people > 0) {
            people = people - ivan.calcHowManyNeedTaxi();
        }

        Taxi gora = new Taxi(1, 4, 1, "Gora");
        if (people > 0) {
            people = people - gora.calcHowManyNeedTaxi();

        }

        Taxi pasha = new Taxi(2, 4, 1, "Pasha");
        if (people > 0) {
            people = people - pasha.calcHowManyNeedTaxi();
        }
    }
}

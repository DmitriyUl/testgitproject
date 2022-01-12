package Homework;

public class Taxi {
    public int hodki;
    public int pasagiry;
    public int hours;
    public String name;


    public Taxi(int hodki, int pasagiry, int hours, String name) {
        this.hodki = hodki;
        this.pasagiry = pasagiry;
        this.hours = hours;
        this.name = name;
    }
    public int calcHowManyNeedTaxi(){
        if (pasagiry<4){
            System.out.println("Автомобиль " + name + " не підходить для роботи в таксі");
        }
        else {
            System.out.println("За " + hours + " годину таксі " + name +" може здійснити " + hodki +
                    " ходки по місту, та перевезти " + hodki*pasagiry + " пасажирів, а за ніч " + 12*hodki*pasagiry + " пасажирів");
        }
        return 12*hodki*pasagiry;
    }
}

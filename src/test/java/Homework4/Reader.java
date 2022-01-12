package Homework4;

public class Reader {
    String namePIB;
    String numberR;
    int phoneNumber;
    int take;
    int returnB;
    int took;
    int have = take+took;


    public Reader(String namePIB, String numberR, int phoneNumber) {
        this.namePIB = namePIB;
        this.numberR = numberR;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    public void takeBooks(int took, int take) {
        System.out.println("Читач " + namePIB + " взяв сьогодні " + take + " книг. " +
                "Загалом читач взяв " + (take + took) + " книг.");
        if (take + took > 5) {
            System.out.println("Штраф за перевищений ліміт " + (((take + took) - 5) * 50) + " грн.");
        }
    }

    public void returnBooks(int returnB, int take, int took) {
        System.out.println("Читач " + namePIB + " повернув сьогодні " + returnB + " книг." +
                " Загалом в читача залишається загальна сума " + ((take + took) - returnB) + " книг.");
        if ((take + took) > 5) {
            System.out.println("Штраф за перевищений ліміт " + (((take + took) - 5) * 50) + " грн.");
        } else if (((take + took) - returnB) > 5) {
            System.out.println("В читача залишається " + ((take+took)-returnB) + " книг , що перевищує встановлений ліміт на " +
                    (((take + took - returnB))-5) + " книги." +
                    " За це передбачено штрафт в розмірі " + ((((take + took - returnB))-5) * 50) + " грн.");
        }


    }
}

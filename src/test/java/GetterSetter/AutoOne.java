package GetterSetter;

public class AutoOne {
    public static void main(String[] arg) {
        AutoGruz gruz = new AutoGruz();
        gruz.setNameDriver("Vova");
        gruz.setNumberAuto("AA3333AA");
        gruz.setWeightGruz(35000);
        gruz.print();
    }
}

class AutoGruz {
    private String numberAuto;
    private String nameDriver;
    private int weightGruz;

    public void setNumberAuto(String number) {
        if (number.isEmpty()) {
            System.out.println("Enter valid data");
        } else
            numberAuto = number;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNameDriver(String driver) {
        if (driver.isEmpty()) {
            System.out.println("Enter valid data");
        } else
            nameDriver = driver;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setWeightGruz(int kg) {
        if (kg <= 0) {
            System.out.println("enter valid data");
        }
        if (kg >= 0) {
            weightGruz = kg;
        }
    }

    public int getWeightGruz() {
        return weightGruz;
    }

    void print() {
        System.out.println(nameDriver);
        System.out.println(numberAuto);
        System.out.println(weightGruz);

    }

}



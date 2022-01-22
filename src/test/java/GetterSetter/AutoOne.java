package GetterSetter;

public class AutoOne {
    public static void main(String[] arg) {
        AutoGruz gruz = new AutoGruz();
        gruz.setNameDriver("Dima");
        gruz.setNumberAuto("06688KK");
        gruz.setWeightGruz(0);
        if (gruz.getNameDriver().isEmpty()){
            System.out.println("Enter name");
        }else
        System.out.println(gruz.getNameDriver());

        if (gruz.getNumberAuto().isEmpty()){
            System.out.println("Enter number");
        }else
        System.out.println(gruz.getNumberAuto());

        if (gruz.getWeightGruz() <= 0){
            System.out.println("Enter weight");
        }else
        System.out.println(gruz.getWeightGruz());
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
        } else {
            weightGruz = kg;
        }
    }

    public int getWeightGruz() {
        return weightGruz;
    }
}



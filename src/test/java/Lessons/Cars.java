package Lessons;


public class Cars {
    String model;
    int VMotor;
    String color;

    public Cars(String model, int VMotor, String color) {
        this.model = model;
        this.VMotor = VMotor;
        this.color = color;
    }

    public Cars(String model, int VMotor) {
        this.model = model;
        this.VMotor = VMotor;
    }

    public Cars(String model) {
        this.model = model;
    }
    public Cars() {
    }


    public void showCars(){
        if(model!=null  || VMotor!=0 || color!=null){
        System.out.println("Модель = " + model + " Обь'єм двигуна " +  + VMotor + " Колір " + color);
        }
        else {
            System.out.println();
        }
    }

}


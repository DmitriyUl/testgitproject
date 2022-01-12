package Lessons;


public class Home {
    int ploscha;
    String name;

    public Home(int ploscha, String name) {
        this.ploscha = ploscha;
        this.name = name;
    }

    public void showHome(){
        System.out.println("Площа = " + ploscha + " " + "имя = " + name);
    }
}

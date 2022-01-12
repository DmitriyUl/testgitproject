package Lessons;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestJava {
    //this is test for checking java
    @Test
    public void check(){
        System.out.println("Hello bratan!!! How do you do???");
//        System.out.println("nvccghjm");
    }
    @Test
    public void doit(){
        System.out.println("What do you do?");
//        System.out.println("nvccghjm");
    }
    @Test
    public void went(){
        System.out.println("Went fishing?");
    }
    @Test
    public void go(){
        System.out.println("Where are we go?");
    }
    @Test
    public void maybe(){
        System.out.println("Maybe we go to fishing in monday");
    }

    @Test
    public void come(){
        System.out.println("Come to visit");
    }
    @Test
    public void help(){
        System.out.println("I need you help");
    }
    @Test
    public void what(){
        System.out.println("what's new?");
    }
    @Test
    public void weather(){
        System.out.println("what is your weather");;
    }
    @Test
    public void learn(){
        System.out.println("I'm studying");
    }
    @Test
    public void checkF(){
        Assert.assertTrue(1==1);
    }

}

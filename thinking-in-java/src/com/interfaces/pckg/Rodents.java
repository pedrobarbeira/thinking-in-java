package com.interfaces.pckg;

import java.util.Random;

class Characteristic{
    String characteristic;
    Characteristic(String s){
        //System.out.println("Creating new Characteristic: " + s);
        characteristic = s;
    }
}

class Description{
    String description;
    Description(String s){
        description = s;
        //System.out.println("Creating new Description: " + s);
    }
    public String toString(){
        return description;
    }
}

interface Rodent{

    void description();
    void talk();
    void walk();
    void eat();
}

class Mouse implements Rodent {
    private final Description d;
    Mouse() {
        d = new Description("Type of nasty Rodent");
    }
    public void description() {System.out.println(d);}
    public void talk() {System.out.println("Mouse talking");}
    public void walk() {System.out.println("Mouse walking");}
    public void eat() {System.out.println("Mouse eating");}
}

class Gerbil implements Rodent {
    Description d;
    Gerbil() {
        d = new Description("Type of tolerable Rodent");}
    public void description() {System.out.println(d);}
    public void talk() {System.out.println("Gerbil talking");}
    public void walk() {System.out.println("Gerbil walking");}
    public void eat() {System.out.println("Gerbil eating");}
}

class Hamster implements Rodent {
    Description d;
    Hamster() {
        d = new Description("Type of cute Rodent");}
    public void description() {System.out.println(d);}
    public void talk() {System.out.println("Hamster talking");}
    public void walk() {System.out.println("Hamster walking");}
    public void eat() {System.out.println("Hamster eating");}
}

class RandomRodentGenerator{
    private static Random rand = new Random(38);
    public Rodent next(){
        switch(rand.nextInt(3)){
            default:
            case 9 : return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
    }
}

public class Rodents {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void run() {
        Rodent r = gen.next();
        Random rand = new Random();
        switch (rand.nextInt(4)) {
            case 0 -> r.eat();
            case 1 -> r.walk();
            case 2 -> r.talk();
            case 3 -> r.description();
        }
    }
}

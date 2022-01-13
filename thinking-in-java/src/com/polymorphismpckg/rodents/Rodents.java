package com.polymorphismpckg.rodents;

import java.util.Random;

class Characteristic{
    Characteristic(String s){
        System.out.println("Creating new Characteristic: " + s);
    }
}

class Description{
    Description(String s){
        System.out.println("Creating new Description: " + s);
    }
}

class Rodent{
    protected Characteristic c;
    private static Random rand = new Random(47);
    Rodent() {
        System.out.println("Creating new Rodent()");
        c = new Characteristic("Small");
        ;}
    public void talk() {System.out.println("Rodent talking");}
    public void walk() {System.out.println("Rodent walking");}
    public void eat() {System.out.println("Rodent eating");}
    public void doRatThings(){
        switch(rand.nextInt(3)){
            default:
            case 0: talk(); break;
            case 1: walk(); break;
            case 2: eat(); break;
        };
    }
}

class Mouse extends Rodent{
    private Description d;
    Mouse() {
        System.out.println("Creating new Mouse()");
        c = new Characteristic("Likes cheese");
        d = new Description("Type of Rodent");
    }
    public void talk() {System.out.println("Mouse talking");}
    public void walk() {System.out.println("Mouse walking");}
    public void eat() {System.out.println("Mouse eating");}
}

class Gerbil extends Rodent{
    Description d;
    Gerbil() {
        System.out.println("Creating new Gerbil()");
        c = new Characteristic("Is even smaller");
        d = new Description("Type of Rodent");}
    public void talk() {System.out.println("Gerbil talking");}
    public void walk() {System.out.println("Gerbil walking");}
    public void eat() {System.out.println("Gerbil eating");}
}

class Hamster extends Rodent{
    Description d;
    Hamster() {
        System.out.println("Creating new Hamster()");
        c = new Characteristic("Very very cute");
        d = new Description("Type of Rodent");}
    public void talk() {System.out.println("Hamster talking");}
    public void walk() {System.out.println("Hamster walking");}
    public void eat() {System.out.println("Hamster eating");}
}

class RandomRodentGenerator{
    private static Random rand = new Random(47);
    public Rodent next(){
        switch(rand.nextInt(4)){
            default:
            case 0 : return new Rodent();
            case 1 : return new Mouse();
            case 2: return new Gerbil();
            case 3: return new Hamster();
        }
    }
}

public class Rodents {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void run(){
        Rodent r0 = new Rodent();
        System.out.println();
        Rodent r1 = new Mouse();
        System.out.println();
        Rodent r2 = new Gerbil();
        System.out.println();
        Rodent r3 = new Hamster();
        System.out.println();
    }
}

package com.interfaces.pckg;

import java.util.Random;

enum Note{
    C, C_SHARP, D_FLAT, D, D_SHARP, E_FLAT, E, E_SHARP,
    F, F_SHARP, G_FLAT, G, G_SHARP, A_FLAT, A, A_SHARP,
    B_FLAT, B, B_SHARP;
}

interface Playable{
    void play(Note n);
}

abstract class Instrument implements Playable{
    public void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    public void play(Note n) { System.out.println("Wind.play() " + n); }
    public String toString(){ return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    public void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Cymbals extends Percussion{
    public void play(Note n){System.out.println("Cymbals.play() " + n + " even though these don't play notes");}
    public String toString() {return "Cymbals";}
    void adjust() {System.out.println("Hammer it out bruv");}
}

class Stringed extends Instrument {
    public void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String toString(){ return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    public void play(Note n) { System.out.println("Brass.play() " + n); }
    public String toString(){return "Brass";}
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    public void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString(){ return "Woodwind"; }
}

class RandomInstrumentGenerator{
    private Random rand = new Random(47);
    public Instrument next(){
        switch(rand.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Cymbals();
            case 3: return new Stringed();
            case 4: return new Brass();
            case 5: return new Woodwind();
        }
    }
}

public class Music3 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void tune(Instrument i) {
        // ...
        i.play(Note.C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void run() {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[10];

        for(int i = 0; i < orchestra.length; i++)
            orchestra[i] = gen.next();

        tuneAll(orchestra);

        for(Instrument it : orchestra)
            System.out.println(it);
    }
}

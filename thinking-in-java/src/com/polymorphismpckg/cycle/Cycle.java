package com.polymorphismpckg.cycle;

public class Cycle {
    protected String s;
    protected int wheelNum;

    public Cycle(){
        s = "Cycling";
    }

    public void getState(){
        System.out.println(s);
        wheels();
    }

    public void wheels(){
        System.out.println("Wheels: " + wheelNum);
    }
}

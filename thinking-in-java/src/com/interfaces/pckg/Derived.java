package com.interfaces.pckg;

import java.util.Random;

abstract class Super{
    public abstract void print();
}

public class Derived extends Super{
    private Integer i = 0;

    public Derived(){
        Random gen = new Random();
        while(i == 0) {
            i = gen.nextInt(Integer.MAX_VALUE);
        }
    }

    @Override
    public void print(){
        System.out.println(i);
    }
}

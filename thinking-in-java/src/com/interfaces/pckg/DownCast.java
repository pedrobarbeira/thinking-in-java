package com.interfaces.pckg;

import java.util.Random;

abstract class SuperDownCast{
    public abstract void downCastGen();
    public abstract void print();
}

public class DownCast extends SuperDownCast{
    private Integer i;

    public DownCast(){
        i = 0;
    }

    @Override
    public void downCastGen(){
        Random gen = new Random();
        i = gen.nextInt();
    }

    @Override
    public void print(){
        System.out.println(i);
    }

    public static void method(SuperDownCast sup){
        sup.downCastGen();
        sup.print();
    }
}

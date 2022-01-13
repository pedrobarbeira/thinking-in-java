package com.interfaces.pckg;

import com.interfaces.pckg.exercise5.Interface;

class Implement1 implements Interface {
    private Integer i;

    public Implement1(){
        System.out.println("Creating new Implement1");
        i = 1;
    }

    public void print(){
        System.out.println("Implement" + i);
    }

    public void set(Integer x){
        i = ++x;
        System.out.println("Implement1 set to " + i);
    }

    public void shift(){
        i *= 1;
        System.out.println("Implement1 shifted to " + i);
    }

}

class Implement2 implements Interface {
    private Integer i;

    public Implement2(){
        System.out.println("Creating new Implement2");
        i = 2;
    }

    public void print(){
        System.out.println("Implement" + i);
    }

    public void set(Integer x){
        i = x + 2;
        System.out.println("Implement2 set to " + i);
    }

    public void shift(){
        i *= 2;
        System.out.println("Implement2 shifted to " + i);
    }
}

class Implement3 implements Interface {
    private Integer i;

    public Implement3(){
        System.out.println("Creating new Implement3");
        i = 1;
    }

    public void print(){
        System.out.println("Implement" + i);
    }

    public void set(Integer x){
        i = x + 3;
        System.out.println("Implement3 set to " + i);
    }

    public void shift(){
        i *= 3;
        System.out.println("Implement3 shifted to " + i);
    }
}

public class Implement {
    public static Interface factory(int i){
        return switch (i) {
            default -> null;
            case 1 -> new Implement1();
            case 2 -> new Implement2();
            case 3 -> new Implement3();
        };
    }
}

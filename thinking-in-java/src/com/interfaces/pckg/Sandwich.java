package com.interfaces.pckg;

interface FastFood{
    void description();
    Integer calorieCount();
}

class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle{
    Pickle() {System.out.println("Pickle()");}
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() { System.out.println("Sandwich()"); }
    public static void run() {
        Sandwich s = new Sandwich();
        s.description();
    }
    public void description(){
        System.out.println("A slice of bread, cheese, lettuce, pickles and another slice of bread");
        System.out.println("Calories: " + calorieCount());
    }
    public Integer calorieCount(){
        return 123;
    }
}

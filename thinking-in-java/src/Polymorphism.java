import java.util.Scanner;
import com.polymorphismpckg.cycle.*;
import com.polymorphismpckg.rodents.Rodents;
import com.polymorphismpckg.sandwich.Sandwich;
import com.polymorphismpckg.shapes.*;
import com.polymorphismpckg.instrument.*;
import com.polymorphismpckg.twomethos.OneMethod;

public class Polymorphism {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    static void ride(Cycle c){
        c.getState();
    }
    static void ex1(){
        Cycle c = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(c);
        ride(u);
        ride(b);
        ride(t);
    }

    static void ex2() {
        //Just add @Override to Shape classes
        Shape[] s = new Shape[9];

        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();

         for (Shape shp : s)
            shp.draw();
    }

    static void ex3(){
        Shape[] s = new Shape[9];

        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();

        for(Shape shape : s)
            shape.fill();
    }

    static void ex4(){
        //Added new Rectangle class
        Shape[] s = new Shape[12];

        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();

        for (Shape shp : s)
            shp.draw();
    }

    static void ex5(){
        Cycle c = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(c);
        ride(u);
        ride(b);
        ride(t);
    }

    static void ex6(){
        Music3.run();
    }

    static void ex7(){
        //Added Cymbals class
        Music3.run();
    }

    static void ex8(){
        //Made it randomly generate instruments
    }

    static void ex9(){
        Rodents.run();
    }

    static void ex10(){
        OneMethod om = new OneMethod();
        OneMethod.run(om);
    }

    static void ex11(){
        Sandwich.run();
    }

    static void ex12(){
        Rodents.run();
    }

    static void ex13(){
        System.out.println("Exercise 13");
    }

    static void ex14(){
        System.out.println("Exercise 14");
    }

    static void ex15(){
        System.out.println("Exercise 15");
    }

    static void ex16(){
        System.out.println("Exercise 16");
    }

    static void ex17(){
        System.out.println("Exercise 17");
    }

    public static void main(String[] args) {
        ex12();
    }
}

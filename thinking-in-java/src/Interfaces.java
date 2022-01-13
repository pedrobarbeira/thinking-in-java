import com.interfaces.pckg.*;
import com.interfaces.pckg.exercise11.Apply;
import com.interfaces.pckg.exercise11.StringAdapter;
import com.interfaces.pckg.exercise11.Swapper;
import com.interfaces.pckg.exercise5.Interface;

public class Interfaces {
    static void ex1(){
        Integer MAX = 10;
        for(int i = 0; i < MAX; i++){
            Rodents.run();
        }
    }
    static void ex2() {
        //AbstractClass n = new AbstractClass();
        //Error: 'AbstractClass' is abstract; cannot be instantiated

    }
    static void ex3(){
        Derived d = new Derived();
        d.print();
        //Class acts as expected: generated a random int and prints it
    };
    static void ex4(){
        DownCast d = new DownCast();
        DownCast.method(d);
    }
    static void ex5(){
        Interface i1 = Implement.factory(1);
        Interface i2 = Implement.factory(2);
        Interface i3 = Implement.factory(3);

        System.out.println("\nTesting i1");
        i1.print();
        i1.set(2);
        i1.print();
        i1.shift();
        i1.print();

        System.out.println("\nTesting i2");
        i2.print();
        i2.set(2);
        i2.print();
        i2.shift();
        i2.print();

        System.out.println("\nTesting i3");
        i3.print();
        i3.set(2);
        i3.print();
        i3.shift();
        i3.print();
    }
    static void ex6(){
        //Interface implementation:
        /*
            void print();
            void set(Integer x);
            void shift();
         */

        //Implement1 implementation (others are similar):
        /*
            class Implement1 implements Interface {
                private Integer i;

                public Implement1(){code}

                public void print(){code}

                public void set(Integer x){code}

                public void shift(){code}
            }
         */
    }
    static void ex7(){
        //Changed Rodent to interface
        ex1();

    }
    static void ex8(){
        //Extended Sandwich to have a FastFood interface with methods
        //decription() and calorieCount()
        Sandwich.run();
    }
    static void ex9(){
        //Made Instrument abstract
    }
    static void ex10(){
        //Created interface Playable and made Instrument implement it
    }
    static void ex11(){
        String s = "Lets shift this around";
        Apply.process(new StringAdapter(new Swapper()), s);
    }
    static void ex12(){
        //Added CanClimb interface to Adventure.java
    }
    static void ex13(){
        TripleInherit obj = new TripleInherit();
        obj.method();
        obj.otherMethod();
        obj.doubleMethod();
        obj.tripleMethod();
    }
    static void ex14(){}
    static void ex15(){}
    static void ex16(){}
    static void ex17(){}
    static void ex18(){}
    static void ex19(){

    }

    public static void main(String[] args) {
        ex13();
    }
}

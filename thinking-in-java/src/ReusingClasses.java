import ReusingClassesPckg.*;

public class ReusingClasses {

    static void ex1(){
        Bottle b = new Bottle("Captain Morgan");

        b.DrinkFactory("Spiced Rum");

        System.out.println(b);
    }

    static void ex2(){
        String[] args = new String[1];
        Skip.main(args);
    }

    static void ex3(){
        Cartoon x = new Cartoon();
    }

    static void ex4(){
        C.getD();
    }

    static void ex5(){
        C c = new C();
    }

    static void ex6(){
        Chess c = new Chess();
    }

    static void ex7(){
        C c = new C();
    }

    static void ex8(){
        Extend e1 = new Extend();
        System.out.println();
        Extend e2 = new Extend("e2");
    }

    static void ex9(){
        Stem s = new Stem("");
    }

    static void ex10(){
        Stem s = new Stem("pretty");
    }

    static void ex12(){
        Stem s = new Stem("pretty");
        try{
            System.out.println("\nInside try block\n");
        }
        finally{
            s.dispose();
        }
    }

    static void ex13(){
        LowCreativity lc = new LowCreativity();
        lc.test();
    }

    static void ex15(){
        Car.test();
    }

    static void ex16(){
        Frog f = new Frog();
        f.swim();
        f.talk();
        f.walk();
    }

    static void ex17(){
        Frog f = new Frog();
        f.doThings();
    }

    //Finish 18 through 24

    public static void main(String[] args) {
        ex16();

    }
}

import java.util.Random;

public class ControllingExecution {
    //Exercise solutions
    static void ex1(){
        for(int i = 1; i <= 100; i++) {
            if (i == 99) break; //Exerise 7 inserted break
            System.out.println(i);
        }
    }
    static void ex2(){
        int rand1, compare;
        Random rand = new Random();
        while(true){    //Exercise 4 made it infinite
            rand1 = rand.nextInt();
            compare = rand.nextInt();
            System.out.print(rand1 + " is ");
            if(rand1 > compare)
                System.out.print("greater");
            else if (rand1 < compare)
                System.out.print("smaller");
            else System.out.print("equal");
            System.out.print(" to " + compare + '\n');
        }
    }
    static void ex4() {
        boolean prime = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) prime = false;
            }
            if(prime) System.out.println(i);
            else prime = true;
        }
    }
    static void ex5(){
        Integer a = 0x1249;
        Integer  b = 0x0DB6;
        Integer  c = a & b;
        Integer  d = a | b;
        Integer  e = a ^ b;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
    }
    static int ex6(int testval, int target, int begin, int end) {
        if(testval < begin || testval > end) return -2;
        else{
            if (testval > target)
                return +1;
            else if (testval < target)
                return -1;
            else
                return 0; // Match
        }
    }
    static void ex8(){
        for(int i = 0; i < 5; i++) {
            switch (i) {
                case 0: System.out.print("Case 0\n"); //break;
                case 1: System.out.print("Case 1\n"); //break;
                case 2: System.out.print("Case 2\n"); //break;
                case 3: System.out.print("Case 3\n"); //break;
                case 4: System.out.print("Case 4\n"); //break;
                default: System.out.print("Case closed\n"); //break;
            }
        }
    }
    static void ex9(int max){
        int x = 1, y = 1;
        while(max > 0){
            System.out.print(x + ", " + y);
            x += y;
            y += x;
            max-= 2;
            if(max > 0) System.out.print(", ");
        }
    }
    static void ex10(){
        int x, y, a1, a2, a3, a4;
        for(int i = 1000; i < 10000; i++) {
            a1 = i / 1000;
            a2 = (i / 100) % 10;
            a3 = (i / 10) % 10;
            a4 = i % 10;
            x = a1 * 10 + a2;
            y = a3 * 10 + a4;
            if (x * y == i) System.out.println(i + " = " + x + " x " + y);
            else {
                x = a1 * 10 + a2;
                y = a4 * 10 + a3;
                if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                else {
                    x = a2 * 10 + a1;
                    y = a3 * 10 + a4;

                    if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                    else {
                        x = a2 * 10 + a1;
                        y = a4 * 10 + a3;

                        if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                        else {
                            x = a1 * 10 + a3;
                            y = a2 * 10 + a4;

                            if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                            else {
                                x = a3 * 10 + a1;
                                y = a2 * 10 + a4;

                                if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                else {
                                    x = a1 * 10 + a3;
                                    y = a4 * 10 + a2;

                                    if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                    else {
                                        x = a3 * 10 + a1;
                                        y = a4 * 10 + a2;

                                        if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                        else {
                                            x = a1 * 10 + a4;
                                            y = a2 * 10 + a3;

                                            if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                            else {
                                                x = a1 * 10 + a3;
                                                y = a2 * 10 + a4;

                                                if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                                else {
                                                    x = a4 * 10 + a1;
                                                    y = a2 * 10 + a3;

                                                    if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                                    else {
                                                        x = a1 * 10 + a3;
                                                        y = a2 * 10 + a4;

                                                        if (x * y == i) System.out.println(i + " = " + x + " x " + y);
                                                        else {
                                                            x = a1 * 10 + a4;
                                                            y = a3 * 10 + a2;

                                                            if (x * y == i)
                                                                System.out.println(i + " = " + x + " x " + y);
                                                            else {
                                                                x = a1 * 10 + a3;
                                                                y = a2 * 10 + a4;

                                                                if (x * y == i)
                                                                    System.out.println(i + " = " + x + " x " + y);
                                                                else {
                                                                    x = a4 * 10 + a1;
                                                                    y = a3 * 10 + a2;

                                                                    if (x * y == i)
                                                                        System.out.println(i + " = " + x + " x " + y);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //Run it
    public static void main(String[] args) {
        ex5();
    }
}

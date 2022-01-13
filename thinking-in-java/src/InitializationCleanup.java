public class InitializationCleanup {
    static void ex1(){
        class EmptyString{
            String s;
            public void print(){
                System.out.print(s);
            }
        }

        EmptyString e1 = new EmptyString();
        e1.print();
    }

    static void ex2(){
        class String1{
            String s = "This is string 1\n";
            public void print(){
                System.out.print(s);
            }
        }

        class String2{
            String s;
            String2(){
                s = "This is string 2\n";
            }
            public void print(){
                System.out.print(s);
            }
        }

        String1 s1 = new String1();
        String2 s2 = new String2();

        s1.print();
        s2.print();

    }

    static void ex3(){
        class Empty{
            Empty(){
                System.out.println("Default constructor lmao");
            }
        }

        Empty e = new Empty();
    }

    static void ex4(){
        class Empty{
            String s = "Default constructor lmao";
            Empty(){
                System.out.println(s);
            }
            Empty(String s1){
                System.out.println(s1);
                System.out.println(s);
            }
        }

        Empty e = new Empty("Im an island boy trying to make it");
    }

    static void ex5(){
        class Dog{
            void bark(int i){
                System.out.println("Barking in int");
            }

            void bark(char i){
                System.out.println("Barking in char");
            }

            void bark(long i){
                System.out.println("Barking in long");
            }

            void bark(float i){
                System.out.println("Barking in float");
            }

            void bark(double i){
                System.out.println("Barking in double");
            }

            void bark(byte i){
                System.out.println("Barking in byte");
            }

            void bark(short i){
                System.out.println("Barking in short");
            }
        }

        byte a = 0;
        char b = 'a';
        short c = 2;
        int d = 3;
        long e = 4;
        float f = 5;
        double g = 6.0;

        Dog dawg = new Dog();

        dawg.bark(a);
        dawg.bark(b);
        dawg.bark(c);
        dawg.bark(d);
        dawg.bark(e);
        dawg.bark(f);
        dawg.bark(g);
    }

    static void ex6(){
        class Dog{
            void bark(int i, char c){
                System.out.println("Barking in int then char");
            }

            void bark(char i, int c){
                System.out.println("Barking in char then int");
            }

            void bark(long i){
                System.out.println("Barking in long");
            }

            void bark(float i){
                System.out.println("Barking in float");
            }

            void bark(double i){
                System.out.println("Barking in double");
            }

            void bark(byte i){
                System.out.println("Barking in byte");
            }

            void bark(short i){
                System.out.println("Barking in short");
            }
        }

        int a = 0;
        char b = 'a';

        Dog dawg = new Dog();

        dawg.bark(a, b);
        dawg.bark(b, a);
    }

    static void ex7(){
        class noConstruct{
            public void print(){
                System.out.println("Spooky bs");
            }
        }

        noConstruct nc = new noConstruct();
        nc.print();
    }

    static void ex8(){
        class Dumb{
            public void print(){
                System.out.println("This is dumb");
            }

            public void run(){
                print();
                this.print();
            }
        }

        Dumb dumb = new Dumb();
        dumb.run();
    }

    static void ex9(){
        class Key{
            int n;

            Key(int n){
                this.n = n;
                System.out.println("Int constructor\nn = " + n);
            }

            Key(){
                this(42);
                System.out.println("Default constructor\nn = " + n);
            }
        }

        Key k = new Key();
    }

    static void ex10(){
        class Terminator{
            protected void finalize(){
                System.out.println("I'll be back");
            }
        }

        Terminator t = new Terminator();
        System.gc();
    }

    static void ex12(){
        class Tank{
            int load;
            int max;

            Tank(){
                load = 0;
                max = 50;
            }

            public void fill(int n){
                System.out.println("Filling tank");
                if(max >= (load + n)){
                    load += n;
                    System.out.println("Tank up to " + n + " litters");
                }
                else {
                    int diff = (load + n) - max;
                    System.out.println("Topped off after " + diff + " litters");
                }
            }

            public void empty(){
                System.out.println("Emptying tank");
                load = 0;
                System.out.println("Tank is empty");
            }

            protected void finalize(){
                if(load != 0) System.out.println("Error: tank isn't empty");
            }
        }

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();

        t1.fill(10);
        System.gc();
        t2.fill(20);
        t2.empty();

    }

    static void ex13(){
        class Cup {
            Cup(int marker) {
                System.out.println("Cup(" + marker + ")");
            }
            void f(int marker) {
                System.out.println("f(" + marker + ")");
            }
        }
        class Cups {
            static Cup cup1;
            static Cup cup2;
            static {
                cup1 = new Cup(1);
                cup2 = new Cup(2);
            }
            Cups() {
                System.out.println("Cups()");
            }
        }
        Cups.cup1.f(9);
    }

    static void ex14(){
        class S{
            static String s1 = "This is string";
            static String s2;
            static{
                System.out.println("Initializing on static block");
                s2 = "This is also string";
            }
            S(){
                System.out.println("Initializing string");
            }

            public static void print(){
                System.out.println(s1);
                System.out.println(s2);
            }
        }

        S a = new S();

        a.print();
    }

    static void ex15(){
        class S{
            String s1;
            {
                s1 = "This is a third string";
                System.out.println("s1 initialized");
            }

            public void print(){
                System.out.println(s1);
            }
        }

        S a = new S();
        a.print();

    }

    static void ex16(){
        String arr[] = {"this", "is", "an", "array", "of", "strings", "for",
                        "a", "dumb", "exercise", "i", "must", "do"};

        for(String s : arr)
            System.out.print(s + " ");
        System.out.println();
    }

    static void ex17(){
        class S{
            String s;
            S(String custom){
                System.out.println("The argument is " + custom);
                s = custom;
            }
        }

        S arr[] = new S[10];

    }

    static void ex18(){
        class S{
            String s;
            S(String custom){
                System.out.println("The argument is " + custom);
                s = custom;
            }
        }

        S arr[] = new S[5];

        arr[0] = new S("Again");
        arr[1] = new S("I must");
        arr[2] = new S("Do some");
        arr[3] = new S("Boring");
        arr[4] = new S("Stuff");

    }

    static void ex19(String... args){
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }

    public enum Money{
        FIVE, TEN, TWENTY, FIDDY, HUNDO
    }

    static void ex21(){

        for(Money bill : Money.values())
            System.out.println(bill + " ordinal: " + bill.ordinal());
    }

    static void ex22(){
        class Wallet{
            Money m;
            Wallet(Money cash){
                m = cash;
            }
            public void howMuch(){
                switch(m){
                    case FIVE: System.out.println("Five bucks"); break;
                    case TEN : System.out.println("Ten bucks"); break;
                    case TWENTY: System.out.println("Go buy some weed"); break;
                    case FIDDY : System.out.println("That's fiddy bucks"); break;
                    case HUNDO : System.out.println("Big hundred bucks"); break;
                }
            }
        }
        Wallet m1 = new Wallet(Money.FIVE);
        Wallet m2 = new Wallet(Money.TEN);
        Wallet m3 = new Wallet(Money.TWENTY);
        Wallet m4 = new Wallet(Money.FIDDY);
        Wallet m5 = new Wallet(Money.HUNDO);

        m1.howMuch();
        m2.howMuch();
        m3.howMuch();
        m4.howMuch();
        m5.howMuch();
    }

    public static void main(String[] args) {
        ex22();
    }
}

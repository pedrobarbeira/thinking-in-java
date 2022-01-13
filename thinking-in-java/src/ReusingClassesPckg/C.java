package ReusingClassesPckg;

class A{
    public A(String s){
        System.out.println("Instance of class " + s);
    }
}

class B{
    public B(String s){
        System.out.println("Instance of class " + s);
    }
}

class D extends B{
    public D(){
        super("B");
        System.out.println("Instance of class D");
    }
}

public class C extends A{
    static B b;

    public C(){
        super("A");
        b = new B("B");
        System.out.println("Instance of class C");
    }

    public static void getD(){
        D d = new D();
    }
}


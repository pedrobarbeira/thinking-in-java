package ReusingClassesPckg;

class Component1{
    Component1(String s){
        System.out.println("Creating Component " + s);
    }

    void dispose(){
        System.out.println("Disposing Component1");
    }
}

class Component2{
    Component2(String s){
        System.out.println("Creating Component " + s);
    }

    void dispose(){
        System.out.println("Disposing Component2");
    }
}

class Component3{
    Component3(String s){
        System.out.println("Creating Component " + s);
    }

    void dispose(){
        System.out.println("Disposing Component3");
    }
}

class Root{
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root(String s){
        System.out.println("Initializing Root components");
        c1 = new Component1("1");
        c2 = new Component2("2");
        c3 = new Component3("3");
        System.out.println("Creating a " + s + " Root");
    }

    void dispose(){
        c3.dispose();
        c2.dispose();
        c1.dispose();
        System.out.println("Disposing Root");
    }
}

public class Stem extends Root{
    public Stem(String s){
        super("Tree");
        System.out.println("Creating a " + s + " Stem");
    }

    public void dispose(){
        super.dispose();
        System.out.println("Disposing Stem");
    }
}

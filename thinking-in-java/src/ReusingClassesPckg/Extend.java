package ReusingClassesPckg;

class Base{
    private String s;

    Base(String s){
        this.s = s;
        System.out.println("Creating a Base with " + s);
    }
}

public class Extend extends Base{
    public Extend(){
        super("Default");
        System.out.println("Creating an Extend");
    }

    public Extend(String s){
        super(s);
        System.out.println("Creating an Extend");
    }

}

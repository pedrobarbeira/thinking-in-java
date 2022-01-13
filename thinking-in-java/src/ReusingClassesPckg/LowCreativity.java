package ReusingClassesPckg;

class Overload{
    void overload(char c){
        System.out.println("overload(char)");
    }

    void overload(int i){
        System.out.println("overload(int)");
    }

    void overload(String s){
        System.out.println("overload(string)");
    }
}

public class LowCreativity extends Overload{
    void overload(double d){
        System.out.println("overload(double)");
    }

    public void test(){
        overload('c');
        overload(1);
        overload("string");
        overload(1.0);
    }

}

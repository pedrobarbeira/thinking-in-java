package com.polymorphismpckg.twomethos;

class TwoMethods{
    public void method1(){
        System.out.println("Calling method2:");
        method2();
    }

    public void method2(){
        System.out.println("This is TwoMethods::method2()");
    }

}
public class OneMethod extends TwoMethods{
    @Override
    public void method2(){
        System.out.println("This is the OneMethod::method2()");
    }

    public static void run(TwoMethods t){
        TwoMethods tm = new OneMethod();
        tm.method1();
    }
}

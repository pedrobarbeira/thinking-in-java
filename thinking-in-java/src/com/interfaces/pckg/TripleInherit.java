package com.interfaces.pckg;

interface Base{
    void method();
}

interface Inherit1 extends Base{
    void otherMethod();
}

interface Inherit2 extends Base{
    void doubleMethod();
}

interface DoubleInherit extends Inherit1, Inherit2{
    void tripleMethod();
}

public class TripleInherit implements DoubleInherit{

    @Override
    public void method() {
        System.out.println("Base::method()");
    }

    @Override
    public void otherMethod() {
        System.out.println("Inherit1::otherMethod()");
    }

    @Override
    public void doubleMethod() {
        System.out.println("Inherit2::doubleMethod()");

    }

    @Override
    public void tripleMethod() {
        System.out.println("DoubleInherti::tripleMethod()");
    }

}

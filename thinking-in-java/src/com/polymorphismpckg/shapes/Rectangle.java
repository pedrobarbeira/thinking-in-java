package com.polymorphismpckg.shapes;

public class Rectangle extends Shape{
    @Override
    public void draw(){System.out.println("Rectangle.draw()");}

    @Override
    public void erase(){System.out.println("Rectangle.erase()");}

    @Override
    public void fill(){System.out.println("Rectangle.fill()");}
}

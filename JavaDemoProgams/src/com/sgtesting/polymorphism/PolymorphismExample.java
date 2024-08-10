package com.sgtesting.polymorphism;
abstract class Shape{
    abstract void shape();
}
class square extends Shape{
    void shape(){
        System.out.println("this is Square shape a * a");
    }
}
class Rectangle extends Shape{
    void shape(){
        System.out.println("This is Rectangle shape L* B");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape sh=null;

        Rectangle r=new Rectangle();
        sh= r;
        sh.shape();
        square sq=new square();
        sh=sq;
        sh.shape();
    }
}

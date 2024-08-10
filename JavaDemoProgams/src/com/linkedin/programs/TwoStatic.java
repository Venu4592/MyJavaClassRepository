package com.linkedin.programs;
class MyDemo1{
    static {
        MyDemo2 md2=new MyDemo2();
        System.out.println("Static block on MyDemo1");
    }
}
class  MyDemo2{
    static {
        MyDemo1 md1=new MyDemo1();
        System.out.println("Static block on MyDemo2");
    }
}
public class TwoStatic {
    public static void main(String[] args) {
        MyDemo2 md2=new MyDemo2();
        MyDemo1 md1=new MyDemo1();
    }
}

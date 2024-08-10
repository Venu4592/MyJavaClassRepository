package com.linkedin.programs;
class demo1{
    {
        System.out.println("Demo1 Instance block");
    }
}
class demo2{
    {
        demo1 d1=new demo1();
        System.out.println("Demo2 Instance block");
    }
}
public class Sir {
    public static void main(String[] args) {
        demo2 d2=new demo2();
    }
}

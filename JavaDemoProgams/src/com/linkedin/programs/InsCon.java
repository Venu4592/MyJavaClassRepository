package com.linkedin.programs;
class MyClass1{
    {
        MyClass2 mc2=new MyClass2();
        System.out.println("Instace class of MyClass1");
    }
}
class MyClass2{
    MyClass2(){
        System.out.println("Constructor of Myclass2");
    }
}
public class InsCon {
    public static void main(String[] args) {
        MyClass1 mc1=new MyClass1();
    }
}

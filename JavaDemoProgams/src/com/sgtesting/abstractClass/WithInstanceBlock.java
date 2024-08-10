package com.sgtesting.abstractClass;
abstract class InstBlock{
    {
        String Name="Velankanni";
        System.out.println("My name is : "+Name);
    }
}
class Sub1 extends InstBlock{
}
public class WithInstanceBlock {
    public static void main(String[] args) {
        Sub1 s1=new Sub1();
    }
}

package com.linkedin.programs;
class M1{
    {
        M2 m=new M2();
        System.out.println("Instance block");
    }
}
class M2{
    static{
        System.out.println("Static block");
    }
}
public class SirMethods {
    public static void main(String[] args) {
        M1 m1=new M1();
    }
}

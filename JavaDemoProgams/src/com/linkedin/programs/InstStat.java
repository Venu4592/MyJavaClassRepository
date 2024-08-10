package com.linkedin.programs;
class Ins{
    {
        String Name;
        System.out.println("THis is instance");
    }
}
class Stat{
    Ins in=new Ins();
    static void myStaticMeth(){
        
        System.out.println("It is Static method");
    }
}
public class InstStat {
    public static void main(String[] args) {
        Stat st=new Stat();
        Stat.myStaticMeth();
    }
}

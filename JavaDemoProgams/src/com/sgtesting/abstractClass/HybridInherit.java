package com.sgtesting.abstractClass;
abstract class GrandFather{
    void displayGFAge(int age){
        System.out.println("Grand Father Age: "+age);
    }
}
class Father extends GrandFather{
    void displayFatherName(String Name){
        System.out.println("Father Name: "+Name);
    }
}
class Son extends GrandFather{
    void displaySonSal(double Sal){
        System.out.println("Salary: "+Sal);
    }
}
class Son1 extends Father{
    void displaySon1Business(String BusinessName){
        System.out.println("Business Name: "+BusinessName);
    }
}

public class HybridInherit {
    public static void main(String[] args) {
        Son1 obj=new Son1();
        obj.displaySon1Business("PG Owner");
        obj.displayFatherName("Rajan");
        obj.displayGFAge(30);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Son s=new Son();
        s.displaySonSal(23467.679);
        s.displayGFAge(90);
    }
}

package com.sgtesting.abstractClass;
abstract class StaticBlock{
    static String Comp_Name="InstaWork";
    static{
        System.out.println("My company Name: "+Comp_Name);
    }
}
class compName extends StaticBlock{

}
public class AbstStatic {
    public static void main(String[] args) {
        compName obj=new compName();
    }
}

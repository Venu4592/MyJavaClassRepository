package com.sgtesting.returnMethodsAssignments;
class Colors{
    String ColorName1(String clr){
        return clr;
    }
}
public class Favorite {
    public static void main(String[] args) {
        Colors objclr=new Colors();
        System.out.println("My Favorite color is: "+objclr.ColorName1("Blue"));
    }
}

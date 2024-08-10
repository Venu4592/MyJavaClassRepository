package com.sgtesting.abstractClass;
abstract class StaticMethods{
    static void mySchool(String schoolName){
        System.out.println("My school name: "+schoolName);
    }
}
public class WithStaticMeth {
    public static void main(String[] args) {
        StaticMethods.mySchool("St. Joseph's High School");
    }
}

package com.sgtesting.returnMethodsAssignments;
class NameofCountry{
    String Country(String Name){
        return Name;
    }
}
public class Country {
    public static void main(String[] args) {
        NameofCountry objcountry=new NameofCountry();
        String con=objcountry.Country("India");
        System.out.println("My country name is: "+con);
    }
}

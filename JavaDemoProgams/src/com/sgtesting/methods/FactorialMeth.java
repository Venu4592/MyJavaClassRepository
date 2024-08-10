package com.sgtesting.methods;
class Fact{
    void FindFact(int num){
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of given num "+num+" is : "+fact);
    }
}
public class FactorialMeth {
    public static void main(String[] args) {
        Fact f=new Fact();
        f.FindFact(6);
        f.FindFact(9);
    }
}

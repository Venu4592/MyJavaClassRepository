package com.sgtesting;
class FactorialMeth{
    void FindFact(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of given num " + num + " is : " + fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        FactorialMeth f=new FactorialMeth();
        f.FindFact(7);
    }
}

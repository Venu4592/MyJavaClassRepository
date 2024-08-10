package com.sgtesting.methodsAssignments;
class PrimeNum{
    void displayPrime(){
        System.out.println("Prime numbers from 1 to 50: ");
        for(int i=1;i<=50;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNum objPrime=new PrimeNum();
        objPrime.displayPrime();
    }
}

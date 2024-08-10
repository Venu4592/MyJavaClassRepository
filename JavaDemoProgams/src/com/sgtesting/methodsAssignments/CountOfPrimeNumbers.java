package com.sgtesting.methodsAssignments;
class PrimeNumCount{
    void displayPrimeCount(){
        int count=0;
        System.out.println("The count of prime numbers from 1 to 100: ");
        for(int i=2;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountOfPrimeNumbers {
    public static void main(String[] args) {
        PrimeNumCount objPrimeCount=new PrimeNumCount();
        objPrimeCount.displayPrimeCount();
    }
}

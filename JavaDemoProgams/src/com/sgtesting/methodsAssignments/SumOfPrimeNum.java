package com.sgtesting.methodsAssignments;
class PrimeSum{
    void displaySumPrime(){
        int sum=0;
        System.out.println("Sum of Prime numbers from 200 to 100 is: ");
        for(int i=200;i>=100;i--){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
public class SumOfPrimeNum {
    public static void main(String[] args) {
        PrimeSum objPrimeSum=new PrimeSum();
        objPrimeSum.displaySumPrime();
    }
}

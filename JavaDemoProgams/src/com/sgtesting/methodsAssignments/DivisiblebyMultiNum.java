package com.sgtesting.methodsAssignments;
class CountofDivisible{
    void FindDivisibleCount(int a){
        int count=0;
        for(int i=a;i<=400;i++){
            if((i%2==0) || (i%4==0) || (i%6==0)){
                count++;
            }
        }
        System.out.println("Count of numbers which are divisible by 2, 4 and 6 is: "+count);
    }
}
public class DivisiblebyMultiNum {
    public static void main(String[] args) {
        CountofDivisible cd=new CountofDivisible();
        cd.FindDivisibleCount(200);
    }
}

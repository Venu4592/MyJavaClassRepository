package com.sgtesting.returnMethodsAssignments;
class EvenNums{
    int[] numEven(){
        int size[]={2,4,6,8,10,12,14,16,18,20};
        return size;
    }
}
public class EvenNum {
    public static void main(String[] args) {
        EvenNums objeven=new EvenNums();
       int[] Numeven= objeven.numEven();
       for( int kk:Numeven){

           System.out.print(kk+" ");
       }
        System.out.println();
    }
}

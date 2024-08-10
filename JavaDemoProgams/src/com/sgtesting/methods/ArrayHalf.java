package com.sgtesting.methods;
class FindSumHalf{
    void SumofSecondHalf(int a[]){
        int sum=0;
        for(int i=a.length/2;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of second half of the elements: "+sum);
    }
}
public class ArrayHalf {
    public static void main(String[] args) {
        FindSumHalf obj=new FindSumHalf();
        obj.SumofSecondHalf(new int[]{20,40,50,60,70,80});
    }
}

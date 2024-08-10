package com.sgtesting.ConstOverloadingProblems;
class TotalElements{
    TotalElements(int arr[][]){
        int total=0;
        for(int[] row:arr){
            for(int col:row){
                total++;
            }
        }
        System.out.println("Total No of Elements in the array: "+total);
    }
}
public class NumberOfElements {
    public static void main(String[] args) {
        int a[][]={
                {100,200,300},
                {400,500,600},
                {700,800,900}};
        TotalElements te=new TotalElements(a);
    }
}

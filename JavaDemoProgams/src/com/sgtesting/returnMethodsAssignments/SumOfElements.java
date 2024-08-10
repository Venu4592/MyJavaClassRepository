package com.sgtesting.returnMethodsAssignments;
class AllElesum{
    short  sum(short [][] ve){
        short sumRes=0;
        for(int i=0;i<ve.length;i++){
            for(int j=0;j<ve[i].length;j++){
                sumRes+=ve[i][j];
            }
        }
        return sumRes;
    }
}
public class SumOfElements {
    public static void main(String[] args) {
        AllElesum objSum=new AllElesum();
        short[][] arr={{100,200,300},{400,500,600}};
        short result=objSum.sum(arr);
        System.out.println("Sum of Elements in the array: "+result);
    }
}

package com.sgtesting.ConstOverloadingProblems;
class EachHalf{
    EachHalf(int a[]){
        double res=0.0;
        for(int i=0;i<a.length;i++){
            res=a[i]/2.0;
            System.out.print(res+" ");
        }
    }
}
public class HalfOfEach {
    public static void main(String[] args) {
        int k[]={11,12,13,14,15};
        EachHalf obj=new EachHalf(k);
    }
}

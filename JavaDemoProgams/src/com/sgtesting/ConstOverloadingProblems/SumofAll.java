package com.sgtesting.ConstOverloadingProblems;
class SumByte{
    SumByte(byte a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=(int)a[i][j];
            }
        }
        System.out.println(sum);

    }
}
public class SumofAll {
    public static void main(String[] args) {
    byte b[][]={{12,13,14},
            {15,16,17}   };
        SumByte sb=new SumByte(b);
    }
}

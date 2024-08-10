package com.sgtesting.ConstOverloadingProblems;
class ReverseDouble{
    ReverseDouble(double d[][]){
        for(int i=d.length-1;i>=0;i--){
            for(int j=i;j>=0;j--) {
                System.out.print(d[i][j] + " ");
            }
        }
    }
}
public class DoubleReverse {
    public static void main(String[] args) {
        double dbl[][]={
                {12.44,14.45,12.32},
                {34.54,17.54,90.54},
                {65.65,54.76,12.79}   };
        ReverseDouble rd=new ReverseDouble(dbl);
    }

}

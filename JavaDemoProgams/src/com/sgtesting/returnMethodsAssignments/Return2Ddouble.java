package com.sgtesting.returnMethodsAssignments;
class Array2D{
    double[][] Arr2D(double [][] myarr){
        return myarr;
    }
}
public class Return2Ddouble {
    public static void main(String[] args) {
        Array2D obj=new Array2D();
        double [][] arr={{10.05,11.05,12.05},{13.05,14.05,15.05}};
        for(double[] v:arr){
            for(double kk:v){
                System.out.print(kk+" ");
            }
            System.out.println();
        }
    }
}

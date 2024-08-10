package com.sgtesting.ConstOverloadingProblems;
class SubstractMatrix{
    // row and column of the matrix should be same
    SubstractMatrix(int a[][],int b[][]){
        int row=a.length;
        int col=a[0].length;
        int res=0;
        System.out.println("After Substraction: ");
        if(a.length !=b.length || a[0].length !=b[0].length){
            System.out.println("Matrix substraction cannot be done since both Row and Column are not same");
        }else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    res=a[i][j]-b[i][j];
                    System.out.print(res+" ");
                }
                System.out.println();
            }
        }
    }
}
public class SubstractTwoMatrix {
    public static void main(String[] args) {
    int x[][]={{10,11,12},{13,14,15}};
    int y[][]={{2,2,1},{5,10,9}};
        System.out.println("Original Matrix:");
        for(int k=0;k<x.length;k++){
            for(int l=0;l<x[k].length;l++){
                System.out.print(x[k][l]+" ");
            }
            System.out.println();
        }
        SubstractMatrix sub=new SubstractMatrix(x,y);
    }
}

package com.sgtesting.returnMethodsAssignments;
class MatrixAddition{
    int[][] AddMatrix(int [][]arr1, int [][] arr2){
        int [][] res =new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return res;
    }
}
public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        MatrixAddition objMatrixAddition=new MatrixAddition();
     int a[][] = {{1,2,3},{4,5,6}};
     int b[][] = {{7,8,9},{10,11,12}};
     int[][] result=objMatrixAddition.AddMatrix(a,b);
     for(int[] i:result){
         for(int k:i){
             System.out.print(k+" ");
         }
         System.out.println();
     }

    }
}

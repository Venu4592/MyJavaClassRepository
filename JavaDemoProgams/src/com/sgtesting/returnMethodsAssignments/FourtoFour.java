package com.sgtesting.returnMethodsAssignments;
class LastTwo{
int [][] myfour(int [][]arr){
    /*int array[][]=new int[arr.length][arr[0].length];
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j]=arr[i][j];
                }
            }*/
            int[][] res=new int[2][arr[0].length];
            int rowIndex = 0;
    for(int k=arr.length-2;k<arr.length;k++){
               // if(k==2 || k==3){
                    for(int l=0;l<arr[k].length;l++){
                        res[rowIndex][l]=arr[k][l];
                    }
                    rowIndex++;
                }
           // }
            return res;
    }
}

public class FourtoFour {
    public static void main(String[] args) {
        LastTwo lt=new LastTwo();
        int[][] result=lt.myfour(new int[][]{{12,13,14,15},
                {16,17,18,19},
                {20,21,22,23},
                {24,25,26,27}});
        for(int[] kk:result){
            for(int res:kk){
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}

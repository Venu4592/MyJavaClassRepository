package com.sgtesting.ConstOverloadingProblems;
class Convertto1D{
    Convertto1D(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int [] OneDArr=new int[row * col];
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                OneDArr[index]=arr[i][j];
                index++;
            }
        }
        for(int kk:OneDArr){
            System.out.print(kk+" ");
        }
        System.out.println();
    }
}
public class TwoDtoOneD {
    public static void main(String[] args) {
        Convertto1D oned=new Convertto1D(new int[][]{{11,12,13},{14,15,16},{17,18,19}});
    }
}

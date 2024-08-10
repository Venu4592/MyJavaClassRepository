package com.sgtesting.ConstOverloadingProblems;
class TranseposeofMatrix{
    TranseposeofMatrix(int a[][],int b[][]) {
        for (int i = 0; i <a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[j][i]=a[i][j];
            }
        }
    }

}
public class TransposeOfElements {
    public static void main(String[] args) {
        int x[][]={{11,12,13},{14,15,16},{17,18,19}};
        int y[][]=new int[x[0].length][x.length];
        System.out.println("Original Matrix: ");
        for(int m=0;m<x.length;m++){
            for(int n=0;n<x[m].length;n++){
                System.out.print(x[m][n] +" ");
            }
            System.out.println();
        }
        TranseposeofMatrix tm=new TranseposeofMatrix(x,y);
        System.out.println("Transeposed Matrix: ");
        for(int m=0;m<x.length;m++){
            for(int n=0;n<x[m].length;n++){
                System.out.print(y[m][n]+" ");
            }
            System.out.println();
        }
    }
}

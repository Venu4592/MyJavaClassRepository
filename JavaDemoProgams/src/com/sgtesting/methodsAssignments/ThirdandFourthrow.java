package com.sgtesting.methodsAssignments;
class FourofFour{
    // to print 3rd and 4th row
    void display3rdand4throw(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        System.out.println("Original Array: ");
        for(int k=0;k<row;k++){
            for(int l=0;l<col;l++){
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println("The 3rd and 4th rows of 4x4 array: ");
        for (int i = 0; i < a.length; i++) {
            if(i==2 || i ==3) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
public class ThirdandFourthrow {
    public static void main(String[] args) {
        FourofFour obj=new FourofFour();
        obj.display3rdand4throw(new int[][]{{12,13,14,15}, {16,17,18,19},{20,21,22,23}, {24,25,26,27}});
    }
}

package com.sgtesting.methodsAssignments;
class DoubleArrayReverse{
    void displayReverseFirstrow(double arr[][]){
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         int col=arr[0].length;
        // Reverse the first row
        System.out.println("Print the reverse of first row");
            for(int l=col-1;l>=0;l--){
                System.out.print(arr[0][l]+" ");
            }
            System.out.println();
        }
    }
public class ReveresofDouble {
    public static void main(String[] args) {
        DoubleArrayReverse objReverse=new DoubleArrayReverse();
        objReverse.displayReverseFirstrow(new double[][]{
                {100.45,200.50,300.60},
                {250.40,300.50,350.60},
                {400.50,450.60,500.70}
        });
    }
}

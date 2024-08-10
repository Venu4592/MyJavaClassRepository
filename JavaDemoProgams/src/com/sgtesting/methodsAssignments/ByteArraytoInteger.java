package com.sgtesting.methodsAssignments;
class BytetoInt{
    void displayBytetoInt(byte b[][]){
        int arr[][]=new int[b.length][b[0].length];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                arr[i][j]=b[i][j];
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
public class ByteArraytoInteger {
    public static void main(String[] args) {
        BytetoInt objbytetoint=new BytetoInt();
        objbytetoint.displayBytetoInt(new byte[][]{
                {10,11,12},
                {13,14,15},
                {16,17,18}
        });
    }
}

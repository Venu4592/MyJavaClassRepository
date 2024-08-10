package com.sgtesting.methodsAssignments;
class CharactertoInteger{
    void displayfromInt(char ch[][]){
        int arr[][]=new int[ch.length][ch[0].length];
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[i].length;j++){
                    arr[i][j]=ch[i][j];
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class ChartoInt {
    public static void main(String[] args) {
        CharactertoInteger objchartoint=new CharactertoInteger();
        objchartoint.displayfromInt(new char[][]{{'a','b','c'},
                {'d','e','f'},
                {'g','h','i'}});
    }
}

package com.sgtesting.returnMethodsAssignments;
class PrintFirstColumn{
    int[] toPrintFirstColumn(int [][] a){
        int firstcolumn[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            firstcolumn[i]=a[i][0];

        }
        return firstcolumn;
    }
}
public class FirstColm {
    public static void main(String[] args) {
        PrintFirstColumn obj=new PrintFirstColumn();
        int a[][]={{12,13,14},{15,16,17}};
        int [] myFirst=obj.toPrintFirstColumn(a);
        for(int l:myFirst){
                        System.out.print(l+" ");
            }
            System.out.println();
        }
    }

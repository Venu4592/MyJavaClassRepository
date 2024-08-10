package com.sgtesting.methodsAssignments;
class AssignRead{
    void display(double a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class CreateAndDisplay {
    public static void main(String[] args) {
        AssignRead obj=new AssignRead();
        obj.display(new double[][]{
                {11.13,12.21,13.31},
                {14.41,15.51,16.61},
                {17.71,18.81,19.91}
        });
    }
}

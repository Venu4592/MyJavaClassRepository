package com.sgtesting.methodsReturn;
class Half{
    int[] getHalfofElements(int arr[]){
        int b[]=new int[arr.length/2];
        int k=0;
        for(int i=0;i<arr.length/2;i++){
            b[k]=arr[i];
        }
        return b;
    }
}
public class HalfOftheElements {
    public static void main(String[] args) {
        Half obj=new Half();
        obj.getHalfofElements(new int[]{10,20,30,40,50,60,70});

    }
}

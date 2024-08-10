package com.sgtesting.ConstOverloadingProblems;

class ThirdColmn{
    ThirdColmn(char arr[][]){
        String thirdCol="";
        int colmThree=2;
        System.out.println("Third Column of the array: ");
        for(int i=0;i<arr.length;i++){
            thirdCol+=arr[i][colmThree]+" ";
        }
        System.out.print(thirdCol);
    }
}
public class CharArrray {
    public static void main(String[] args) {
        char ch[][]={{'a','b','c'},
                {'d','e','f'},
                {'g','h','i'}};
        System.out.println("Original Array: ");
        for(int k=0;k<ch.length;k++){
            for(int l=0;l<ch[k].length;l++){
                System.out.print(ch[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println("*********************************");

        ThirdColmn tc=new ThirdColmn(ch);

    }
}

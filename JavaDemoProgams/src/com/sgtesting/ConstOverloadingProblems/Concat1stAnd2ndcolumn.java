package com.sgtesting.ConstOverloadingProblems;
class OneAndTwo{
    OneAndTwo(String [][] str){
        String firstandSecond="";
        for(int i=0;i<str.length;i++){
            if(str[i].length>=2){
                //printing the first and second coulmn after concatenating
                firstandSecond=str[i][0]+" "+str[i][1];
                System.out.print(firstandSecond);
            }
            System.out.println();
        }
    }
}
public class Concat1stAnd2ndcolumn {
    public static void main(String[] args) {
        String st[][]={
                {"One","Two","Three"},
                {"Four","Five","Six"}};
        OneAndTwo ot=new OneAndTwo(st);
    }
}

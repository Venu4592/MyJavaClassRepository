package com.sgtesting.ConstOverloadingProblems;
class Concat{
    Concat(String s[][]){
        System.out.println("Original String: ");
        System.out.println("**********************************");
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                System.out.print(s[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("**********************************");
        System.out.println();
        System.out.println("Scond row of the String matrix");
        System.out.println("**********************************");
        String concatRow="";
        int secondRow=1;
        for(int k=0;k<s[secondRow].length;k++){
            concatRow+=s[secondRow][k];
        }
        System.out.print(concatRow);
    }
}
public class Concat2ndRow {
    public static void main(String[] args) {
        String a[][]={{"Arun","Bala","Chanran"},
                {"Danu","Mana","luck"},
                {"Look","For","Name"}}  ;
        Concat con=new Concat(a);
    }
}

package com.sgtesting.returnMethodsAssignments;
class Concat{
    String[][] displayConcat(String [][] str){
        String[][] s=new String[str.length][str[0].length];
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                s[i][j]=str[i][j];
            }
        }
        return s;
    }
}
public class Concat2Dstring {
    public static void main(String[] args) {
        Concat cc=new Concat();
        String[][] myString={{"Ab","Cd","Ef"},{"Gh","Ij","Kl"}};
       String[][] strings= cc.displayConcat(myString);
       for(String[] s1:strings){
           for(String s2:s1){
               System.out.print(s2);
           }
       }
    }
}

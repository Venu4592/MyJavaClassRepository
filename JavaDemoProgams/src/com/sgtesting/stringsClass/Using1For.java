package com.sgtesting.stringsClass;

public class Using1For {
    public static void main(String[] args) {
        pyramidProgFor1();
    }
    static void pyramidProgFor1(){
        String str = "PROGRAM";
        char[] newstr=str.toCharArray();
        String result="";
        for(int i=0;i<newstr.length;i++){
            result+=newstr[i]+" ";
            System.out.println(result);
        }
        System.out.println();
        System.out.println("**********************************************");
    }
}

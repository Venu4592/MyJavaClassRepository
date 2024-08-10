package com.sgtesting.stringsClass;

public class Pyramid {
    public static void main(String[] args) {
        pyramidProgFor1();
        pyramidProg();
       pyramidProg2();
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
    static void pyramidProg(){
        String S="PROGRAM";
        for(int i=0;i<S.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(S.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println("*************************************************");
    }
    static void pyramidProg2(){
    String st= "PROGRAM";
    for(int i=0;i<st.length();i++){
        for(int j=0;j<=i;j++){
            System.out.print(st.charAt(j)+"  ");
        }
        System.out.println();
    }
    for (int k=st.length()-1;k>0;k--){
        for(int l=0;l<k;l++){
            System.out.print(st.charAt(l)+"  ");
        }
        System.out.println();
    }
    }
}

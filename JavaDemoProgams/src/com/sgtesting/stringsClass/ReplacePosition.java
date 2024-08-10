package com.sgtesting.stringsClass;

public class ReplacePosition {
    public static void main(String[] args) {
        PositionReplace("Bengalore and Mysore");
    }
    static void PositionReplace(String str){
        String st[]=str.split(" ");
        for(int i=st.length-1;i>=0;i--){
            System.out.print(st[i]+" ");
        }
    }
}

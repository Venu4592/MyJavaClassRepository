package com.sgtesting.stringsClass;

public class CountChars {
    static void CountChars(String str){
        int count=0;
        for (char ch:str.toCharArray()){
            count=count+1;
        }
        System.out.println("Count of characters in the given string: "+count);
    }
    public static void main(String[] args) {
        CountChars("Velankanni");
    }
}

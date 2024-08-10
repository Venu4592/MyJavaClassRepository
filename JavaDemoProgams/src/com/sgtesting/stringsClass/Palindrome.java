package com.sgtesting.stringsClass;

public class Palindrome {
    public static void main(String[] args) {
        stringPalindrome();
    }
    static void stringPalindrome(){
        String Str= "Baby";
        System.out.println("Original String: "+Str);
        String StrNew="";
            for(int i=Str.length()-1;i>=0;i--){
                StrNew+=Str.charAt(i);
        }
        System.out.println("Reversed String: "+StrNew);
        if(StrNew.equalsIgnoreCase(Str)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not palindrome");
        }
    }
}

package com.sgtesting.stringsClass;
class CountWords{
    static String[] wordCount(String str){
        String words[]=str.split(" ");
        System.out.println("The count of total words in the given string: "+words.length);
        return words;
    }
}
public class NumberOfWords {
    public static void main(String[] args) {
        CountWords.wordCount("This is my string which will say the count of words.");
    }
}

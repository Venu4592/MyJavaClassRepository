package com.sgtesting.methodsAssignments;
class AtoZ{
    void display(char ch){
        for(char C=ch;ch<='Z';ch++){
            System.out.print(ch+", ");
        }
    }
}
public class DisplayChars {
    public static void main(String[] args) {
        AtoZ obj=new AtoZ();
        obj.display('A');
    }
}

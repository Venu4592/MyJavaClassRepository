package com.sgtesting.methodsAssignments;
class OneToTwenty{
    void displayAllTwentyTables(int start){
        for(int i=start;i<=20;i++){
            System.out.println("Multiplication of table no "+i+": ");
            for(int j=1;j<=10;j++){
                System.out.println(j+" x " +i+" = "+(i*j));
            }
        }
    }
}
public class All20tables {
    public static void main(String[] args) {
        OneToTwenty objTable=new OneToTwenty();
        objTable.displayAllTwentyTables(1);
    }
}

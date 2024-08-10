package com.sgtesting.methodsAssignments;
class EvenNumCount{
    void displayCount(int num){
        int count=0;
        System.out.println("The count of even nums: ");
        for(int i=num;i<=500;i++){
            if((i%2)==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountOfEvennum {
    public static void main(String[] args) {
        EvenNumCount obj=new EvenNumCount();
        obj.displayCount(1);
    }
}

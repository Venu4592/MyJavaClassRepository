package com.sgtesting.methodsAssignments;
class SquaresSum{
    void displaySum(int num){
        int square=0;
        int sum=0;
        System.out.println("Sum of square of each number from 1 to 10: ");
        for(int i=num;i<=10;i++){
            square=i*i;
            sum=sum+square;
        }
        System.out.println(sum);
    }
}
public class SumofSquares {
    public static void main(String[] args) {
        SquaresSum objSquareNum=new SquaresSum();
        objSquareNum.displaySum(1);
    }
}

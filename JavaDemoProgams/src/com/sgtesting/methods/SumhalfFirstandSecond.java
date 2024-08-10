package com.sgtesting.methods;
class FirstAndSecond {
    void FirstHalfandSecondHalf(int arr[]) {
    int FirstHalf=0;
    for(int i=0;i<arr.length/2;i++){
        FirstHalf=FirstHalf+arr[i];
    }
        System.out.println("sum of First Half of elements: "+FirstHalf);
    int SecondHalf=0;
    for(int k=arr.length/2;k<arr.length;k++){
        SecondHalf=SecondHalf+arr[k];
    }
        System.out.println("Sum of Second Half of the Elements: "+SecondHalf);
        System.out.println("Final Addition: "+(FirstHalf+SecondHalf));
    }
}

public class SumhalfFirstandSecond {
    public static void main(String[] args) {
        FirstAndSecond obj=new FirstAndSecond();
        obj.FirstHalfandSecondHalf(new int[]{11,12,13,14,15,16,17});
    }
}

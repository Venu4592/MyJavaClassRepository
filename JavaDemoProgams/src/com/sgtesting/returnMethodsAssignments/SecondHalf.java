package com.sgtesting.returnMethodsAssignments;
class HalfSecond{
    double[] displaySecond(double[] arr){
        double[] secondHalf=new double[arr.length / 2];
        int j=0;
        for(int i=arr.length/2;i<arr.length;i++){
                secondHalf[j++] = arr[i];
            }
        return secondHalf;
    }
}
public class SecondHalf {
    public static void main(String[] args) {
        HalfSecond objsecond=new HalfSecond();
        double a[]={12.01,1.90,4.56,6.45,9.12,13.89,16.55,17.23};
        double[] result=objsecond.displaySecond(a);
        for (double element : result) {
            System.out.print(element+" ");
        }

    }
}

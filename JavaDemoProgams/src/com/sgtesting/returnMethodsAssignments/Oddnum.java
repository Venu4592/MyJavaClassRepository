package com.sgtesting.returnMethodsAssignments;
class NumOdd{
    int[] numsOdd(int StartNum){
        int size=(StartNum-1)/2+1;
        int[] odd=new int[size];
        int index=0;
        for(int i=10;i>=1;i--){
            if(i%2!=0){
                odd[index++]=i;
            }
        }
        // Resize the array to the actual number of even numbers found
        if (index < odd.length) {
            int[] temp = new int[index];
            for (int i = 0; i < index; i++) {
                temp[i] = odd[i];
            }
            return temp;
        }
        return odd;
    }
}
public class Oddnum {
    public static void main(String[] args) {
        NumOdd objodNum=new NumOdd();
        int[] storeOdd=objodNum.numsOdd(10);
        for(int kk:storeOdd){
            System.out.print(kk+" ");
        }
    }
}

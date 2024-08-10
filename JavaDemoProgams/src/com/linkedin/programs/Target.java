package com.linkedin.programs;
class TargetMatching{
    void findPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==20 || (arr[i]+arr[j])==4){
                    System.out.print("{"+arr[i]+", "+arr[j]+"}"+",");
                }
            }
        }
    }
}
public class Target {
    public static void main(String[] args) {
        TargetMatching tmobj=new TargetMatching();
        tmobj.findPairs(new int[]{9,5,14,3,1,15,6});
    }
}

package com.sgtesting.methods;
class FindFirstandLast{
    void MethFandL(int [] a){
        for(int i=0;i<a.length;i++){
          if((i==0)|| i==(a.length-1)){
              System.out.println(a[i]+" ");
          }
        }
    }
}
public class FirstAndLast {
    public static void main(String[] args) {
        FindFirstandLast obj=new FindFirstandLast();
        obj.MethFandL(new int[]{1, 2, 3, 4, 5});
    }
}

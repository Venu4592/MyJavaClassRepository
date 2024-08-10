package com.sgtesting.methodsReturn;
class dish{
    String [] LikeDish(String d[]){
        return d;
    }
}
public class FavoriteDish {
    public static void main(String[] args) {
        dish obj=new dish();
    String myDishes[]=obj.LikeDish(new String[]{"Briyani","Payasam","MuttonFry"});
       for(String val:myDishes){
           System.out.println(val+" ");
       }
    }
}

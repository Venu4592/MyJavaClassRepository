package com.sgtesting.ConstructorOverloading;
class Supply{
    Supply(String Sup_Name,String Sup_id,int Quantity){
        System.out.println("Suplier Name: "+Sup_Name);
        System.out.println("Supplier id: "+Sup_id);
        System.out.println("Quantity: "+Quantity);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    Supply(String Suplyto,int Quantity,int QualityType){
        System.out.println("Supplying to: "+Suplyto);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Quality Type: "+QualityType);
    }
}
public class Supplier {
    public static void main(String[] args) {
        Supply supply1=new Supply("Heaven","12God",1000);
        Supply supply2=new Supply("Velankanni",10000,1);
    }
}

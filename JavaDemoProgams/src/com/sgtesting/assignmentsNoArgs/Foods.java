package com.sgtesting.assignmentsNoArgs;
class Restaurent{
    String FoodOrder;
    double Amount;
    int TableNo;
    Restaurent(){
        FoodOrder="Briyani";
        Amount=1234.11;
        TableNo=9;
        System.out.println("FoodOrderd: "+FoodOrder);
        System.out.println("Amount: "+Amount);
        System.out.println("TableNo: "+TableNo);
        System.out.println("**********************************************");
    }
}
class FoodDelivary{
    String customerName="Velankanni";
    String customerAddress="Banglore";
    float orderAmount=231.45f;
    FoodDelivary(){
        System.out.println("customerName: "+customerName);
        System.out.println("customerAddress: "+customerAddress);
        System.out.println("orderAmount: "+orderAmount);
    }
}
public class Foods {
    public static void main(String[] args) {
        Restaurent rest=new Restaurent();
        FoodDelivary fd=new FoodDelivary();
    }
}

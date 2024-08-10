package com.sgtesting.ConstructorOverloading;
class WholeSale{
    WholeSale(String Name, String ProductName, long incoming,long Outgoing){
        System.out.println("Name of Whole Saler: "+Name);
        System.out.println("Name of the Product: "+ProductName);
        System.out.println("Incoming count: "+incoming);
        System.out.println("Outgoing count: "+Outgoing);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    WholeSale(String ProductName, double MRPrize,double RetailPrice,double Sellingprice){
        System.out.println("Product Name: "+ProductName);
        System.out.println("MRP: "+MRPrize);
        System.out.println("Retail Price: "+RetailPrice);
        System.out.println("Selling price: "+Sellingprice);
    }
}
public class WholeSeller {
    public static void main(String[] args) {
        WholeSale wh=new WholeSale("Venu Garments","Zero Shirts",102938376,345643);
        WholeSale wh1=new WholeSale("Zero Shirts",1230.20,1100.00,1000.20);
    }
}

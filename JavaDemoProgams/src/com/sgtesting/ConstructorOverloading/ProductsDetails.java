package com.sgtesting.ConstructorOverloading;
class Products{
    Products(String Name,float Price){
        System.out.println("Name of the Product: "+Name);
        System.out.println("Price of the Product: "+Price);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    Products(String Manufacturer,String Address,String ExpiryDate){
        System.out.println("Name of the Manufacturer: "+Manufacturer);
        System.out.println("Address of the Manufacturer: "+Address);
        System.out.println("Expiry Date: "+ExpiryDate);
    }
}
public class ProductsDetails {
    public static void main(String[] args) {
        Products prod=new Products("Pynole",129.69f);
        Products product=new Products("PP Solutions","11,Office Lane","12:02:2024");


    }
}

package com.sgtesting.ConstructorOverloading;
class Consumer{
    Consumer(String Product, float price, long PhoneNumber){
        System.out.println("Product: "+Product);
        System.out.println("price: "+price);
        System.out.println("Phone Number: "+PhoneNumber);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    Consumer(String ConsumerName,String Product){
        System.out.println("Consumer Name: "+ConsumerName);
        System.out.println("Product: "+Product);
    }
}
public class Buyer {
    public static void main(String[] args) {
        Consumer cons1=new Consumer("Shirt",600.45f,345675223);
        Consumer cons2=new Consumer("Balachandar","Shirt");

    }
}

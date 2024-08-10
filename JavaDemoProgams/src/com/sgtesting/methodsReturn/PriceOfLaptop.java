package com.sgtesting.methodsReturn;
class LaptopPrice{
    double laptopAmount(double amount){
        return amount;
    }
}
public class PriceOfLaptop {
    public static void main(String[] args) {
        LaptopPrice lp=new LaptopPrice();
       double d= lp.laptopAmount(200000.34);
        System.out.println("The amount of Laptop: "+d);
    }
}

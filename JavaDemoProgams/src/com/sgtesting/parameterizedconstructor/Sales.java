package com.sgtesting.parameterizedconstructor;
class Shop{
    String ShopName;
    String ShopOwnerName;
    String ShopAddress;
    Shop(String ShopName,String ShopOwnerName, String ShopAddress){
        this.ShopName=ShopName;
        this.ShopAddress=ShopAddress;
        this.ShopOwnerName=ShopOwnerName;
        System.out.println("Shop Name: "+ShopName);
        System.out.println("Shop Address: "+ShopAddress);
        System.out.println("Shop Owner Name: "+ShopOwnerName);
        System.out.println("*************************************************************");
    }
}
class Purchase{
    String ShopName;
    String More_PurchasedItem;
    String CrowdedTiming;
    Purchase(String shopName,String more_purchasedItem, String crowdedTiming){
        this.ShopName=shopName;
        this.CrowdedTiming=crowdedTiming;
        this.More_PurchasedItem=more_purchasedItem;
        System.out.println("Shop Name: "+ShopName);
        System.out.println("Crowded Timing: "+CrowdedTiming);
        System.out.println("More_PurchasedItem: "+More_PurchasedItem);
        System.out.println("*************************************************************");
    }
}
class Distributor{
    String Dist_Name;
    String Dist_Area;
    String Dist_Location;
    Distributor(String Dist_Name,String Dist_Area,String Dist_Location){
        this.Dist_Name=Dist_Name;
        this.Dist_Area=Dist_Area;
        this.Dist_Location=Dist_Location;
        System.out.println("Distributor Name: "+Dist_Name);
        System.out.println("Distributor Area: "+Dist_Area);
        System.out.println("Distributor Location: "+Dist_Location);
        System.out.println("*************************************************************");
    }
}
public class Sales {
    public static void main(String[] args) {
        Shop obj_shop=new Shop("Venu Super Market","Velankanni R","Vellore Market road");
        Purchase obj_Purchase=new Purchase("Venu Super Market","Shakthi Masala","03:00:00 pm to 07:30:00 pm");
        Distributor obj_distributor=new Distributor("God","Heaven","Paraloka");
    }
}
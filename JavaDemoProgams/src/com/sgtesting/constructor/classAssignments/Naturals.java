package com.sgtesting.constructor.classAssignments;
class Fruits{
    String GeneralName;
    String BotanicalName;
    String Origin;
    int PricePerKg;
}
class Flowers{
    String FlowerGeneralName;
    String FlowerBotanicalName;
    String Origin;
    int PricePerBundle;
}
class Vegitables{
    String VegitableName;
    String VegitableBotanicalName;
    String Origin;
    int pricePerKg;
}
public class Naturals {
    public static void main(String args[]){
        Fruits fruit=new Fruits();
        fruit.GeneralName="Apple";
        fruit.BotanicalName="Malus pumila";
        fruit.Origin="Kazakhstan";
        fruit.PricePerKg=200;
        System.out.println("Fruits GeneralName: "+fruit.GeneralName);
        System.out.println("Fruits Botanical Name: "+fruit.BotanicalName);
        System.out.println("Country of Origin: "+fruit.Origin);
        System.out.println("Price per Kg: "+fruit.PricePerKg);
        System.out.println("####################################################");
        Flowers flwr=new Flowers();
        flwr.FlowerGeneralName="Dahlia";
        flwr.FlowerBotanicalName="Dahlia pinnata (D. × pinnata)";
        flwr.Origin="Mexico and Central America";
        flwr.PricePerBundle=4000;
        System.out.println("FlowerGeneralName: "+flwr.FlowerGeneralName);
        System.out.println("FlowerBotanicalName: "+flwr.FlowerBotanicalName);
        System.out.println("Country of Origin: "+flwr.Origin);
        System.out.println("PricePerBundle: "+flwr.PricePerBundle);
        System.out.println("####################################################");
        Vegitables vegis=new Vegitables();
        vegis.VegitableName="Carrot";
        vegis.VegitableBotanicalName="Daucus carota";
        vegis.Origin="Eurasia ";
        vegis.pricePerKg=30;
        System.out.println("VegitableName: "+vegis.VegitableName);
        System.out.println("VegitableBotanicalName: "+vegis.VegitableBotanicalName);
        System.out.println("Country of Origin: "+vegis.Origin);
        System.out.println("pricePerKg: "+vegis.pricePerKg);
    }
}

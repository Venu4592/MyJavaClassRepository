package com.sgtesting.constructor.NoargsConstructor;
class Fruits{
    Fruits() {
        String GeneralName;
        String BotanicalName;
        String Origin;
        int PricePerKg;
        GeneralName="Apple";
        BotanicalName="Malus pumila";
        Origin="Kazakhstan";
        PricePerKg=200;
        System.out.println("Fruits GeneralName: "+GeneralName);
        System.out.println("Fruits Botanical Name: "+BotanicalName);
        System.out.println("Country of Origin: "+Origin);
        System.out.println("Price per Kg: "+PricePerKg);
        System.out.println("####################################################");
    }
}
class Flowers{
    Flowers() {
        String FlowerGeneralName;
        String FlowerBotanicalName;
        String Origin;
        int PricePerBundle;
        FlowerGeneralName="Dahlia";
        FlowerBotanicalName="Dahlia pinnata (D. × pinnata)";
        Origin="Mexico and Central America";
        PricePerBundle=4000;
        System.out.println("FlowerGeneralName: "+FlowerGeneralName);
        System.out.println("FlowerBotanicalName: "+FlowerBotanicalName);
        System.out.println("Country of Origin: "+Origin);
        System.out.println("PricePerBundle: "+PricePerBundle);
        System.out.println("####################################################");
    }
}
class Vegitables{
    Vegitables() {
        String VegitableName;
        String VegitableBotanicalName;
        String Origin;
        int pricePerKg;
        VegitableName="Carrot";
        VegitableBotanicalName="Daucus carota";
        Origin="Eurasia ";
        pricePerKg=30;
        System.out.println("VegitableName: "+VegitableName);
        System.out.println("VegitableBotanicalName: "+VegitableBotanicalName);
        System.out.println("Country of Origin: "+Origin);
        System.out.println("pricePerKg: "+pricePerKg);
    }
}
public class LivingNature {
    public static void main(String[] args) {
        Fruits fruit=new Fruits();
       Flowers flwr=new Flowers();
       Vegitables vegis=new Vegitables();

    }
}



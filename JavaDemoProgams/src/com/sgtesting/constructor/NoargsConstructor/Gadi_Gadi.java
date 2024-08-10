package com.sgtesting.constructor.NoargsConstructor;
class Two_Wheeler {
    String BikeName;
    String Model;
    String OutDate;
    int OnRoadPrice;

    Two_Wheeler(){

    BikeName="Yemaha";
    Model="R15";
    OutDate="2023:04:05";
    OnRoadPrice=150000;
        System.out.println("BikeName: "+BikeName);
        System.out.println("Model: "+Model);
        System.out.println("LaunchDate: "+OutDate);
        System.out.println("OnRoadPrice: "+OnRoadPrice);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
 }
}
class Four_Wheeler{
    String CarName;
    String Model;
    String LaunchDate;
    double Price;
    Four_Wheeler(){
        CarName="BMW";
        Model="BMW01834";
        LaunchDate="2023:05:12";
        Price=345866.83;
        System.out.println("CarName: "+CarName);
        System.out.println("Model"+Model);
        System.out.println("LaunchDate: "+LaunchDate);
        System.out.println("OnRoadPrice: "+Price);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
class Heavy_Vehicle{
    String VehicleName;
    String Model;
    String LaunchDate;
    long PriceHeavy;
    Heavy_Vehicle(){
        VehicleName="Lorry";
        Model="Ashok Layland 2023";
        LaunchDate="2023:03:01";
        PriceHeavy=2000000;
        System.out.println("VehicleName: "+VehicleName);
        System.out.println("Lorry Model"+Model);
        System.out.println("LaunchDate: "+LaunchDate);
        System.out.println("OnRoadPrice: "+ PriceHeavy);
    }
}

public class Gadi_Gadi {
    public static void main(String[] args) {
        Two_Wheeler twowheel = new Two_Wheeler();
        Four_Wheeler four = new Four_Wheeler();
        Heavy_Vehicle heavy = new Heavy_Vehicle();
    }
}

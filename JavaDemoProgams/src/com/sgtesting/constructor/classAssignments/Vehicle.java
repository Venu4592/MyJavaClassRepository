package com.sgtesting.constructor.classAssignments;
class Two_Wheeler{
    String BikeName;
    String Model;
    String OutDate;
    int OnRoadPrice;
}
class Four_Wheeler{
    String CarName;
    String Model;
    String LaunchDate;
    double Price;
}
class Heavy_Vehicle{
    String VehicleName;
    String Model;
    String LaunchDate;
    long PriceHeavy;
}
public class Vehicle {
    public static void main(String[] args) {
        Two_Wheeler twowheel=new Two_Wheeler();
        twowheel.BikeName="Yemaha";
        twowheel.Model="R15";
        twowheel.OutDate="2023:04:05";
       twowheel.OnRoadPrice=150000;
        System.out.println("BikeName: "+twowheel.BikeName);
        System.out.println("Model: "+twowheel.Model);
        System.out.println("LaunchDate: "+twowheel.OutDate);
        System.out.println("OnRoadPrice: "+twowheel.OnRoadPrice);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Four_Wheeler four=new Four_Wheeler();
        four.CarName="BMW";
        four.Model="BMW01834";
        four.LaunchDate="2023:05:12";
        four.Price=345866.83;
        System.out.println("CarName: "+four.CarName);
        System.out.println("Model"+four.Model);
        System.out.println("LaunchDate: "+four.LaunchDate);
        System.out.println("OnRoadPrice: "+four.Price);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Heavy_Vehicle heavy=new Heavy_Vehicle();
        heavy.VehicleName="Lorry";
        heavy.Model="Ashok Layland 2023";
        heavy.LaunchDate="2023:03:01";
        heavy.PriceHeavy=2000000;
        System.out.println("VehicleName: "+heavy.VehicleName);
        System.out.println("Lorry Model"+heavy.Model);
        System.out.println("LaunchDate: "+heavy.LaunchDate);
        System.out.println("OnRoadPrice: "+ heavy.PriceHeavy);
    }
}

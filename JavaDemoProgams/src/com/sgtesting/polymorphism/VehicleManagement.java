package com.sgtesting.polymorphism;
abstract class ManageVehicle{
    abstract void calculateFuelEfficiency();
}
class Car extends ManageVehicle{
    public void calculateFuelEfficiency(){
        System.out.println("It is calculating car's Fuel Efficiency");
    }
}
class Bus extends ManageVehicle{
    public void calculateFuelEfficiency(){
        System.out.println("It is calculating bus's Fuel Efficiency");
    }
}
class Truck extends ManageVehicle{
    public void calculateFuelEfficiency(){
        System.out.println("It is calculating Truck's Fuel Efficiency");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        ManageVehicle mv=null;

        Car c=new Car();
        mv=c;
        mv.calculateFuelEfficiency();

        Bus b=new Bus();
        mv=b;
        mv.calculateFuelEfficiency();

        Truck t=new Truck();
        mv=t;
        mv.calculateFuelEfficiency();

    }
}

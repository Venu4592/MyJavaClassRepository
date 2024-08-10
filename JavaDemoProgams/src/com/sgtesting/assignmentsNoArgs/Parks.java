package com.sgtesting.assignmentsNoArgs;
class NationalParks{
    NationalParks(){
        String NameOfPark="Bharatpur Bird Sanctuary";
        String CityName="Rajasthan";
        String WorkingHours="10:00:00 am to 05:00:00 pm";
        int entranceFee=200;
        System.out.println("NameOfPark: "+NameOfPark);
        System.out.println("CityName: "+CityName);
        System.out.println("WorkingHours: "+WorkingHours);
        System.out.println("entranceFee: "+entranceFee);
    }
}
class ThemeParks{
    ThemeParks() {
        String NameOfThemePark = "Wonderla";
        String CityName = "Bengaluru";
        String WorkingHours = "10:00:00 am to 04:00:00 pm";
        int entranceFee = 1000;
        System.out.println("NameOfThemePark: "+NameOfThemePark);
        System.out.println("CityName: "+CityName);
        System.out.println("WorkingHours: "+WorkingHours);
        System.out.println("entranceFee: "+entranceFee);
    }
}
public class Parks {
    public static void main(String[] args) {
        ThemeParks themepark=new ThemeParks();
        NationalParks np=new NationalParks();
    }
}

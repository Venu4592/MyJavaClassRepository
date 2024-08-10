package com.sgtesting.assignmentsNoArgs;
class WildAnimals{
    String AnimalName="Lion";
    String AnimalFamily="Felidae";
    int YearsOfLiving=12;
    float Feet=3.2f;
    WildAnimals(){
        System.out.println("Animal Name: "+AnimalName);
        System.out.println("Animal Family: "+AnimalFamily);
        System.out.println("Years Of Living: "+YearsOfLiving);
        System.out.println("Feet: "+Feet);
    }
}
class AcquaticAnimal{
    String NameOfSpecious="Dolphine";
    int LivingYears=15;
    String FamilyName="Delphinidae";
    String Origin="Sea";
    AcquaticAnimal(){
        System.out.println("Name Of Specious "+NameOfSpecious);
        System.out.println("Animal Family: "+FamilyName);
        System.out.println("Years Of Living: "+LivingYears);
        System.out.println("Origin: "+Origin);

    }
}
public class AnimalTypes {
    public static void main(String[] args) {
        WildAnimals wa=new WildAnimals();
        AcquaticAnimal AA=new AcquaticAnimal();

    }
}

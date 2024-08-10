package com.sgtesting.ConstructorOverloading;
class InsuranceCom{
    InsuranceCom(String NameCompany,String InsurerName, long amount){
        System.out.println("Isurence Company Name: "+NameCompany);
        System.out.println("Insurer Name: "+InsurerName);
        System.out.println("Insurence amont: "+amount);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
    InsuranceCom(String Empname,String EmpId){
        System.out.println("Employer Name: "+Empname);
        System.out.println("EmpId: "+EmpId);
    }
}
public class Insurance {
    public static void main(String[] args) {
        InsuranceCom ic=new InsuranceCom("Bajaj Insurance","Velankanni",300000);
        InsuranceCom ic2=new InsuranceCom("xyz.com","abc129093");
    }
}

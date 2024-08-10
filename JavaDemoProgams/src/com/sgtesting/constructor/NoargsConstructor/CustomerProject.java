package com.sgtesting.constructor.NoargsConstructor;
class Customers{
    String CustomerName;
    String CustomerCountry;
    long CustomerBudjet;
    String SPOC;
    Customers(){
        CustomerName="Orange";
        CustomerCountry="USA";
        CustomerBudjet=1245678;
        SPOC="Velankanni";
        System.out.println("CustomerName: "+CustomerName);
        System.out.println("CustomerCountry: "+CustomerCountry);
        System.out.println("CustomerBudjet: "+CustomerBudjet);
        System.out.println("SPOC : "+SPOC);
        System.out.println("####################################");
    }
}
class Project{
    String ProjetName;
    String ProjectFund;
    String ProjectDeliveryDate;
    String CustomerName_Project;
    Project(){
        ProjetName="Mastering";
        CustomerName_Project="Velankani";
        ProjectDeliveryDate="2023:12:24";
        ProjectFund="200000";
        System.out.println("ProjetName: "+ProjetName);
        System.out.println("CustomerName_Project: "+ CustomerName_Project);
        System.out.println("ProjectDeliveryDate: "+ProjectDeliveryDate);
        System.out.println("ProjectFund : "+ProjectFund);
        System.out.println("####################################");
    }
}
class Task{
    String TaskName;
    String DevName;
    String QAName;
    String ExpectedToCompleteByDev;
    String ExpectedToCompleteByQA;
    Task(){
        TaskName="Mastering";
        DevName="Sunil";
        QAName="Velankanni";
        ExpectedToCompleteByDev="2024:10:23";
        ExpectedToCompleteByQA="2024:11:05";
        System.out.println("TaskName: "+ TaskName);
        System.out.println("Developer Name: "+DevName);
        System.out.println("Q A Name: "+ QAName);
        System.out.println("Expected To Complete By Dev: "+ExpectedToCompleteByDev);
        System.out.println("Expected To Complete By QA: "+ExpectedToCompleteByQA);
    }

}

public class CustomerProject {
    public static void main(String[] args) {
        Customers customer=new Customers();
        Project proj=new Project();
        Task tsk=new Task();
    }
}

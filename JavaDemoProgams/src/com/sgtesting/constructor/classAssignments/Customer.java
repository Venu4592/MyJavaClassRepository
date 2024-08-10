package com.sgtesting.constructor.classAssignments;
class Customers{
    String CustomerName;
    String CustomerCountry;
    long CustomerBudjet;
    String SPOC;
}
class Project{
    String ProjetName;
    String ProjectFund;
    String ProjectDeliveryDate;
    String CustomerName_Project;
}
class Task{
    String TaskName;
    String DevName;
    String QAName;
    String ExpectedToCompleteByDev;
    String ExpectedToCompleteByQA;
}
public class Customer {
    public static void main(String[] args) {
        Customers customer=new Customers();
        customer.CustomerName="Orange";
        customer.CustomerCountry="USA";
        customer.CustomerBudjet=1245678;
        customer.SPOC="Velankanni";
        System.out.println("CustomerName: "+customer.CustomerName);
        System.out.println("CustomerCountry: "+customer.CustomerCountry);
        System.out.println("CustomerBudjet: "+customer.CustomerBudjet);
        System.out.println("SPOC : "+customer.SPOC);
        System.out.println("####################################");
        Project proj=new Project();
        proj.ProjetName="Mastering";
        proj.CustomerName_Project="Velankani";
        proj.ProjectDeliveryDate="2023:12:24";
        proj.ProjectFund="200000";
        System.out.println("ProjetName: "+proj.ProjetName);
        System.out.println("CustomerName_Project: "+ proj.CustomerName_Project);
        System.out.println("ProjectDeliveryDate: "+proj.ProjectDeliveryDate);
        System.out.println("ProjectFund : "+proj.ProjectFund);
        System.out.println("####################################");
        Task tsk=new Task();
        tsk.TaskName="Mastering";
        tsk.DevName="Sunil";
        tsk.QAName="Velankanni";
        tsk.ExpectedToCompleteByDev="2024:10:23";
        tsk.ExpectedToCompleteByQA="2024:11:05";
        System.out.println("TaskName: "+ tsk.TaskName);
        System.out.println("Developer Name: "+tsk.DevName);
        System.out.println("Q A Name: "+ tsk.QAName);
        System.out.println("Expected To Complete By Dev: "+tsk.ExpectedToCompleteByDev);
        System.out.println("Expected To Complete By QA: "+tsk.ExpectedToCompleteByQA);

    }
}

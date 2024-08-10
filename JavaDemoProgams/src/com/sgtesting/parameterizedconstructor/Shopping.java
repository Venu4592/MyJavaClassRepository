package com.sgtesting.parameterizedconstructor;
class Wholesaler{
    String Name;
    String Address;
    String PhoneNumber;
    String GSTNum;
    Wholesaler(String Name,String Address,String PhoneNumber,String GSTNum){
        this.Name=Name;
        this.Address=Address;
        this.PhoneNumber=PhoneNumber;
        this.GSTNum=GSTNum;
        System.out.println("Name of the Whole Saler: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Phone Number"+PhoneNumber);
        System.out.println("GSTNum: "+GSTNum);
        System.out.println("***************************************************");
    }
}
class Retailer{
    String Name_Retailer;
    String RetalierNum;
    String RetailerPhone;
    Retailer(String RetailerName,String RetailerNumber,String RetailerPhone){
        this.Name_Retailer=RetailerName;
        this.RetailerPhone=RetailerPhone;
        this.RetalierNum=RetailerNumber;
        System.out.println("Retailer Name: "+RetailerName);
        System.out.println("Retailer Number: "+RetailerNumber);
        System.out.println("Retailer Number: "+RetailerNumber);
        System.out.println("*********************************************************");

    }
}
class Customer{
    String CustomerName;
    String CustomerNumber;
    String Phone;
    Customer(String CustomerName,String CustomerNumber,String Phone){
        this.CustomerName=CustomerName;
        this.CustomerNumber=CustomerNumber;
        this.Phone=Phone;
        System.out.println("Customer Name: "+CustomerName);
        System.out.println("Customer Number: "+CustomerNumber);
        System.out.println("Phone: "+Phone);
        System.out.println("****************************************************");
    }
}
public class Shopping {
    public static void main(String[] args) {
        Wholesaler whole=new Wholesaler("Abc","xyz","123456789","IN2301COMP23990182");
        Retailer retail=new Retailer("Anbu","RE101290","567892534");
        Customer cust=new Customer("Bala","Cust3421","23413234");
    }
}

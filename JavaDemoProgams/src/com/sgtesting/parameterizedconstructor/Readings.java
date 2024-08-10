package com.sgtesting.parameterizedconstructor;
class NewsPaper{
    String NewspaperName;
    String PrintCity;
    String DeliveryTime;
    NewsPaper(String npName,String city,String Time){
        this.NewspaperName=npName;
        this.PrintCity=city;
        this.DeliveryTime=Time;
        System.out.println("News Paper Name: "+npName);
        System.out.println("Printing City Name: "+city);
        System.out.println("Delivery time: "+Time);
        System.out.println("###########################################################");
    }
}
class Magazine{
    String MagazineName;
    String Type;
    long Users;
    Magazine(String Magazine_Name,String type,long UsersCount){
        this.MagazineName=Magazine_Name;
        this.Type=type;
        this.Users=UsersCount;
        System.out.println("Magazine Name: "+MagazineName);
        System.out.println("Type: "+type);
        System.out.println("Users: "+UsersCount);
        System.out.println("###########################################################");
    }
}
class Comics{
    String ComicName;
    String Author;
    double Amount;
    int Pages;
    Comics(String Name,String AuthorName,double Price,int PageNums){
        this.Author=AuthorName;
        this.ComicName=Name;
        this.Amount=Price;
        this.Pages=PageNums;
        System.out.println("Comic Name: "+Name);
        System.out.println("Author: "+AuthorName);
        System.out.println("Amount : "+Amount);
        System.out.println("Pages: "+PageNums);
        System.out.println("###########################################################");
    }
}
public class Readings {
    public static void main(String[] args) {
        NewsPaper np=new NewsPaper("Hindu Tamil","Chennai","03:00:00am");
        Magazine mz=new Magazine("The Economist","Weekly Magazine",2000);
        Comics comics=new Comics("The Amazing Spider-Man","Stan Lee",12.99,120);

    }
}

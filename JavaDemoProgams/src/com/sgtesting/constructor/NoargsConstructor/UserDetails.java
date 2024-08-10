package com.sgtesting.constructor.NoargsConstructor;

class UserProfiles{
    String UserName;
    String UserEmailId;
    long UserMobileNuber;
    char UserGender;
    UserProfiles(){
        UserName="Balasubramaiyan";
        UserEmailId="abc@yopmail.com";
        UserMobileNuber=123212343;
        UserGender='M';
        System.out.println("UserName: "+UserName);
        System.out.println("UserEmailId: "+UserEmailId);
        System.out.println("UserMobileNuber: "+UserMobileNuber);
        System.out.println("UserGender: "+UserGender);
        System.out.println("******************************************");
    }
}
class RoleOfUser{
    String UserRole;
    String DateofJoining;
    String Tools;
    int connections;
    RoleOfUser(){
        UserRole="Quality Analyst";
        DateofJoining="2021:04:06";
        Tools="Git,Graylogs,Grafana";
        connections=5;
        System.out.println("UserRole: "+UserRole);
        System.out.println("Tools: "+Tools);
        System.out.println("connections: "+connections);
        System.out.println("Date of Joining: "+DateofJoining);
    }
}
public class UserDetails {
    public static void main(String[] args) {
        UserProfiles up=new UserProfiles();
        RoleOfUser role=new RoleOfUser();
    }
}

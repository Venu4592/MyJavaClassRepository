package com.sgtesting.constructor.classAssignments;
class UserProfiles{
    String UserName;
    String UserEmailId;
    long UserMobileNuber;
    char UserGender;
}
class RoleOfUser{
    String UserRole;
    String DateofJoining;
    String Tools;
    int connections;
        }
public class Users {
    public static void main(String[] args) {
        UserProfiles up=new UserProfiles();
        up.UserName="Balasubramaiyan";
        up.UserEmailId="abc@yopmail.com";
        up.UserMobileNuber=123212343;
        up.UserGender='M';
        System.out.println("UserName: "+up.UserName);
        System.out.println("UserEmailId: "+up.UserEmailId);
        System.out.println("UserMobileNuber: "+up.UserMobileNuber);
        System.out.println("UserGender: "+up.UserGender);
        System.out.println("******************************************");
        RoleOfUser role=new RoleOfUser();
        role.UserRole="Quality Analyst";
        role.DateofJoining="2021:04:06";
        role.Tools="Git,Graylogs,Grafana";
        role.connections=5;
        System.out.println("UserRole: "+role.UserRole);
        System.out.println("Tools: "+role.Tools);
        System.out.println("connections: "+role.connections);
        System.out.println("Date of Joining: "+role.DateofJoining);
    }
}

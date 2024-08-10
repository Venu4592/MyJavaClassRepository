package com.sgtesting.abstractClass;
abstract class Employee{
    String EmpName;
    String EmpNum;
    Employee(String EmpName,String EmpNum){
        this.EmpName=EmpName;
        this.EmpNum=EmpNum;
        System.out.println("Employee Name: "+EmpName);
        System.out.println("Employee Num: "+EmpNum);
    }
}
class Companys extends Employee{

    Companys(String EmpName, String EmpNum) {
        super(EmpName, EmpNum);
    }
}
class Companys2 extends Companys{

    Companys2(String EmpName, String EmpNum) {
        super(EmpName, EmpNum);
    }
}
public class ParamConst {
    public static void main(String[] args) {
        Companys2 obj=new Companys2("BalaSubramaniyan N","RE10CL234");
    }
}

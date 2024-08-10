package com.sgtesting.constructor.NoargsConstructor;
class Employee{
    Employee() {
        String EmployeeName = "Velankanni R";
        int empAge = 27;
        double empSalary = 34564.4560;
        String EmpDepartment = "Technology";
        String EmpId = "021";
        System.out.println("EmployeeName: " + EmployeeName);
        System.out.println("EmpId: " + EmpId);
        System.out.println("empAge: " + empAge);
        System.out.println("empSalary: " + empSalary);
        System.out.println("EmpDepartment: " + EmpDepartment);
        System.out.println("****************************************************");
    }
}
class Department{
    Department() {
        String DepartmentId = "E010";
        String DepartmentName = "Technology";
        String Dept_Start = "2023-04-01";
        String Dept_HOD = "Prabakar";
        System.out.println("DepartmentId: " + DepartmentId);
        System.out.println("DepartmentName: " + DepartmentName);
        System.out.println("Dept_Start: " + Dept_Start);
        System.out.println("Dept_HOD: " + Dept_HOD);
        System.out.println("****************************************************");
    }
}
class Insurance {
    Insurance(){
    String InsuranceCompanyName = "Axa Life Insurance";
    String InsuranceType = "Personal Loan";
    double InsuranceAmount = 2500000;
    String InsuranceDate_Start = "2024:12:04";
    String Insurance_Approver = "Prabhakar";
        System.out.println("InsuranceCompanyName: "+InsuranceCompanyName);
        System.out.println("InsuranceType: "+InsuranceType);
        System.out.println("InsuranceAmount: "+InsuranceAmount);
        System.out.println("InsuranceDate_Start: "+InsuranceDate_Start);
        System.out.println("Insurance_Approver: "+Insurance_Approver);
    }
}
public class Employees {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Department dept=new Department();
        Insurance insur=new Insurance();
    }
}

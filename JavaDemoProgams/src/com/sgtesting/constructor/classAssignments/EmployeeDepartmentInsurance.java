package com.sgtesting.constructor.classAssignments;
class Employee{
    String EmployeeName;
    int empAge;
    double empSalary;
    String EmpDepartment;
    String EmpId;
}
class Department{
    String DepartmentId;
    String DepartmentName;
    String Dept_Start;
    String Dept_HOD;
}
class Insurance{
    String InsuranceCompanyName;
    String InsuranceType;
    double InsuranceAmount;
    String InsuranceDate_Start;
    String Insurance_Approver;
}
public class EmployeeDepartmentInsurance {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.EmployeeName="Velankanni";
        emp.empAge=27;
        emp.empSalary=34564.4560;
        emp.EmpDepartment="Technology";
        emp.EmpId="021";
        System.out.println("EmployeeName: "+emp.EmployeeName);
        System.out.println("EmpId: "+emp.EmpId);
        System.out.println("empAge: "+emp.empAge);
        System.out.println("empSalary: "+emp.empSalary);
        System.out.println("EmpDepartment: "+emp.EmpDepartment);
        System.out.println("****************************************************");

        Department dept=new Department();
        dept.DepartmentId="E010";
        dept.DepartmentName="Technology";
        dept.Dept_Start="2023-04-01";
        dept.Dept_HOD="Prabakar";
        System.out.println("DepartmentId: "+dept.DepartmentId);
        System.out.println("DepartmentName: "+dept.DepartmentName);
        System.out.println("Dept_Start: "+dept.Dept_Start);
        System.out.println("Dept_HOD: "+dept.Dept_HOD);
        System.out.println("****************************************************");

        Insurance insur=new Insurance();
        insur.InsuranceCompanyName="Axa Life Insurance";
        insur.InsuranceType="Personal Loan";
        insur.InsuranceAmount=2500000;
        insur.InsuranceDate_Start="2024:12:04";
        insur.Insurance_Approver="Prabhakar";
        System.out.println("InsuranceCompanyName: "+insur.InsuranceCompanyName);
        System.out.println("InsuranceType: "+insur.InsuranceType);
        System.out.println("InsuranceAmount: "+insur.InsuranceAmount);
        System.out.println("InsuranceDate_Start: "+insur.InsuranceDate_Start);
        System.out.println("Insurance_Approver: "+insur.Insurance_Approver);

    }
}

package com.sgtesting.parameterizedconstructor;

import java.sql.SQLOutput;

class University{
    String UniversityName="Bharathidasan University";
    String collegeName;
    String collegeCode;
    String address;
    University(String collegeName, String collegeCode, String address){
        this.collegeName=collegeName;
        this.collegeCode=collegeCode;
        this.address=address;
        System.out.println("Universtiy Name: "+UniversityName);
        System.out.println("College Name: "+collegeName);
        System.out.println("College Code: "+collegeCode);
        System.out.println("Address: "+address);

        System.out.println("*************************************************************");
    }
}
class College{
    String UniversityName;
    String UniversityCode;
    String CollegeName;
    String CollegeAddress;
    College(String universityName,String universityCode,String Collegename,String collegeAddress){
        this.UniversityName=universityName;
        this.UniversityCode=universityCode;
        this.CollegeName=Collegename;
        this.CollegeAddress=collegeAddress;

        System.out.println("College Name: "+CollegeName);
        System.out.println("College Address: "+CollegeAddress);
        System.out.println("University Name: "+UniversityName);
        System.out.println("University Code: "+UniversityCode);
        System.out.println("*************************************************************");
    }
}
class Student{
    String Stid;
    String Stu_Name;
    String Phonenum;
    String CollegeName;
    Student(String Stu_id,String Stud_name,String PhoneNum,String CollegeName){
        this.Stid=Stu_id;
        this.Stu_Name=Stud_name;
        this.Phonenum=PhoneNum;
        this.CollegeName=CollegeName;

        System.out.println("Student Id: "+Stu_id);
        System.out.println("Student Name: "+Stud_name);
        System.out.println("Student Phone Number: "+PhoneNum);
        System.out.println("Student College Name: "+CollegeName);
        System.out.println("*************************************************************");
    }

}
public class Education {
    public static void main(String[] args) {
        University obj1=new University("Annai Vailankanni Arts and Science college", "Ab0923","Bengaluru");
        College obj2 = new College("Bharathidasan University","BH001034","Annai Vailankanni Arts and Science college","Thanjavur");
        Student obj3=new Student("BH1034AV1209CS","Velankanni R","93655643263","Annai Vailankanni Arts and Science college");

    }
}

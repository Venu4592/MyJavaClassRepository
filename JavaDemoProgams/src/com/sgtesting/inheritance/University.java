package com.sgtesting.inheritance;
class MyUniversity{
    MyUniversity(String uniName,String CityName){
        System.out.println("University Name: "+uniName);
        System.out.println("City Name: "+CityName);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    MyUniversity(int uniNum,String VCName){
        System.out.println("University Number: "+uniNum);
        System.out.println("V C Name: "+VCName);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
class MyCollege extends MyUniversity{
    MyCollege(String uniName,String CityName,String CollName){
        super(uniName,CityName);
        System.out.println("College Name: "+CollName);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    MyCollege(int uniNum,String VCName,String collegeNum){
        super(uniNum,VCName);
        System.out.println("College Number: "+collegeNum);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
class MySchool extends MyCollege{
    MySchool(String uniName,String CityName,String CollName,String schoolName){
        super(uniName,CityName,CollName);
        System.out.println("Name of the School: "+schoolName);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    MySchool(int uniNum,String VCName,String collegeNum,int SchoolNum){
        super(uniNum,VCName,collegeNum);
        System.out.println("School Num: "+SchoolNum);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
public class University {
    public static void main(String[] args) {
        MySchool obj=new MySchool("PES University","Bengaluru","ABC college","Velankanni Schools");
        MySchool obj2=new MySchool(124,"Anna","VD235",1290);
    }
}

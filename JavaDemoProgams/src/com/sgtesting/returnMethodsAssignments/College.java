package com.sgtesting.returnMethodsAssignments;
class CollegeName{
    String collegeName(){
        String clgName="AVASC";
        return clgName;
    }
}
public class College {
    public static void main(String[] args) {
        CollegeName objClg=new CollegeName();
       String ClgName= objClg.collegeName();
        System.out.println("College Name is: "+ClgName);
    }
}

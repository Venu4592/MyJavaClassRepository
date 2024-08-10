package com.sgtesting.abstractClass;
abstract class Constructoverload{
    Constructoverload(int sl_Num){
        System.out.println("Sl.No: "+sl_Num);
    }
    Constructoverload(String Name){
        System.out.println("Name: "+Name);
    }
    Constructoverload(String address, String pincode){
        System.out.println("Address: "+address);
        System.out.println("Pincode: "+pincode);
    }
}
class Sub3 extends Constructoverload{

    Sub3(int sl_Num) {
        super(sl_Num);
    }

    Sub3(String Name) {
        super(Name);
    }

    Sub3(String address, String pincode) {
        super(address, pincode);
    }
}
public class ConstOver {
    public static void main(String[] args) {
        Sub3 obj=new Sub3(001);
        Sub3 obj2=new Sub3("Velankanni");
        Sub3 obj3=new Sub3("USA","US123");
    }
}

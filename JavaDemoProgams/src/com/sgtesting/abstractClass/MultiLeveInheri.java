package com.sgtesting.abstractClass;
abstract class Company{
    void MyCompany(){
        String cmp="WorkWork";
        System.out.println("Mycompany Name: "+cmp);
    }
}
class ChildCompany extends Company{

}
class SisterCompany extends Company{

}
public class MultiLeveInheri {
    public static void main(String[] args) {
        SisterCompany obj=new SisterCompany();
        obj.MyCompany();
    }
}

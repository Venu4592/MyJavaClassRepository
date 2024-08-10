package com.sgtesting.polymorphism;
abstract class MyPayments{
   abstract void paymentMethods();
}
class Debit extends MyPayments{
    public void paymentMethods(){
        System.out.println("Paying through Debit card is so Expensive");
    }
}
class Credit extends MyPayments{

    public void paymentMethods(){
        System.out.println("Paying through credit card is dangerous");
    }

}
class netBanking extends MyPayments{
  public void  paymentMethods(){
        System.out.println("Paying through is safe and secure");
    }
}
public class Payments {
    public static void main(String[] args) {
        MyPayments mp=null;

        Debit debit=new Debit();
        mp=debit;
        mp.paymentMethods();

        Credit credit=new Credit();
        mp=credit;
        mp.paymentMethods();

        netBanking netbanking=new netBanking();
        mp=netbanking;
        mp.paymentMethods();
    }
}

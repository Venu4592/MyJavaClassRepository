package com.sgtesting.polymorphism;
interface Banks{
    void loanCalculator();
}
class HLoan implements Banks{
    public void loanCalculator(){
        System.out.println("This is home Loan Method");
    }
}
class PLoan implements Banks{
    public void loanCalculator(){
        System.out.println("This is Personal Loan");
    }
}

public class Bankloans {
    public static void main(String[] args) {
        Banks bank=null;
        PLoan pl=new PLoan();
        bank=pl;
        bank.loanCalculator();

        HLoan hl=new HLoan();
        bank=hl;
        bank.loanCalculator();
    }
}

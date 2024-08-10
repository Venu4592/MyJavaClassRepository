package com.sgtesting.inheritance;
class MathsBase{
    MathsBase(int a,int b){
        System.out.println("Addition Result: "+(a+b));
    }
    MathsBase(int n,int m,int k){
        System.out.println("it is from Maths Base Const with 3 variables");
    }
}
class MathsAlgebra extends MathsBase{
    MathsAlgebra(int a,int b,int c){
        super(a,b);
        System.out.println("Square of num: "+(c=(a*a)+(b*b)+(2*a*b)));
    }
    MathsAlgebra(int n,int m,int k,int d ){
        super(m,n,k);
        System.out.println("this is const from MathsAlgebra with 4 parameters");
    }

}
class MathsStat extends MathsBase{
    MathsStat(int a,int b,int c,int k){
        super(a,b,c);
        System.out.println("Statistics : "+(k=(a/b)));
    }
    MathsStat(int a,int b){
        super(a,b);{
            System.out.println("this is from MathsStat");
        }
    }
}
class Mathscommerce extends MathsStat{
    Mathscommerce(int a,int b,int c,int k,int l){
        super(a,b);
        System.out.println("Maths Commerce="+(l=a+b+c+k));
    }
    Mathscommerce(int a,int b,int c,int k){
        super(a,b,c,k);
        System.out.println("this is MathCommerce Const.");
    }
}
public class MathsClass {
    public static void main(String[] args) {
        Mathscommerce mc=new Mathscommerce(22,43,56,67,1);
        Mathscommerce mc2=new Mathscommerce(1000,2000,5000,3400);
    }
}

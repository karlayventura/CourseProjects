package com.syntax.class23;

class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest(){
        System.out.println(balance*interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance*interest)+2);
    }
}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance*interest)+1);
    }
}
public class Task5 {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,.15);
        creditCard.calculateInterest();
        AX ax=new AX(100,.15);
        ax.calculateInterest();
        Visa visa =new Visa(100,.15);
        visa.calculateInterest();
    }
}

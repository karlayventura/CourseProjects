package com.syntax.class18;

public class AccountTester {

    public static void main(String[] args) {
        Account account=new Account();

        /* Accessing a field directly is different
         From accessing the same field with methods
         having different access modifier
         */

        // System.out.println(account.userName);
        // System.out.println(account.password);
        // System.out.println(account.balance);
        // System.out.println(account.accountNumber);

        // Access through methods
        // account.printUserName(); = Private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}

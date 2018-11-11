package Masterclass;

import Masterclass.BankAccount;

public class Main {
    public static void main(String[]args){
//        Car porche = new Car();
//        Car holden = new Car();
//        porche.setModel("911");
//        System.out.println("Model is "+porche.getModel());

        BankAccount bobsAccount = new BankAccount(12345, 0.00, "Bob Brown", "myemail@bob.com","(314)471 8211" );
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);







    }
}

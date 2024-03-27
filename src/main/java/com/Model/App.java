package com.Model;


public class App 
{
    public static void main( String[] args ) {
        VendingMachineImpl vendingMachine = new VendingMachineImpl();


        vendingMachine.addCurrency(1000);
        vendingMachine.request(1);
        vendingMachine.request(2);
        vendingMachine.request(3);
        vendingMachine.request(4);
        vendingMachine.request(5);
        vendingMachine.request(6);


        String[] products = vendingMachine.getProducts();
        for (String product : products) {
            System.out.println(product);
        }

        int balance = vendingMachine.endSession();
        System.out.println("Balance: " + balance + "SEK");
    }
}

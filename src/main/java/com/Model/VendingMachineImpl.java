package com.Model;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl  implements VendingMachine {
    private Map<Integer, Product> products = new HashMap<>();
    private int depositPool;

    public VendingMachineImpl() {

        products.put(1,new Water(true) );
        products.put(2,new Water(false));
        products.put(3,new Chips(true));
        products.put(4,new Chips(false));
        products.put(5,new Candy(true));
        products.put(6,new Candy(false));
    }

    @Override
    public void addCurrency(int amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 || amount == 50 || amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            depositPool += amount;
        } else {
            System.out.println("Invalid amount.");
        }
    }

    @Override
    public Product request(int id) {
        Product product = product.get(id);
        if (product != null) {
            if (depositPool >= product.getPrice()) {
                depositPool -= product.getPrice();
                return product;
            } else {
                System.out.println("Insufficient balance.");
                return null;
            }
        } else {
            System.out.println("Product not found");
            return null;
        }
    }

    @Override
    public int endSession() {
        int balance = depositPool;
        depositPool = 0;
        return balance;
    }

    @Override
    public String getDescription(int id) {
        Product product = product.get(id);
        if (product != null) {
            return product.getProductName() + " - " + product.getPrice() + " SEK";
        } else {
            return "Product not found.";
        }
    }

    @Override
    public String[] getProducts() {
        return product.values().stream()
                .map(product -> product.getId() + ": " + product.getProductName() + " - " + product.getPrice() + " SEK" )
                .toArray(String[] ::new);
    }
}

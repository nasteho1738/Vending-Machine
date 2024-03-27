package com.Model;

public interface VendingMachine {
    void addCurrency(int amount);
    Product request(int amount);
    int endSession();
    String getDescription(int id);
    String[] getProduct();
}



package com.Model;

public class Water extends Product {
    protected boolean isCold;

    public Water(boolean isCold) {
        this.isCold = isCold;
        setPrice(isCold ? 30.0 : 20.0);
    }

    public enum Water {
        COLD, NOT_COLD
    }

    @Override
    public String examine() {
        return "Examining" + (isCold ? "cold" : "not cold") + ("water bottle");

    }
    @Override
    public String use() {
        return "Drinking " +(isCold ? "cold" : "not cold") + "water.";

    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean isCold) {
        this.isCold = isCold;
    }
}

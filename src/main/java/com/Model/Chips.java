package com.Model;

public class Chips extends Product {
    private boolean isSpacy;
    public Chips(boolean isSpacy) {
        this.isSpacy = isSpacy;
        setPrice(isSpacy ? 45.0 : 40.0);
    }

    public enum Chips {
        SPICY, NOT_SPACY
    }

    @Override
    public String examine() {
        return "Examining" + (isSpacy ? "spacy" : "not spacy") + "chips.";

    }
    @Override
    public String use() {
        return "Eating chips.";

    }

    public boolean isSpacy() {
        return isSpacy ;
    }

    public void setSpacy(boolean isSpacy ) {
        this.isSpacy = isSpacy;
    }
}

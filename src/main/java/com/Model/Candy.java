package com.Model;

public class Candy extends Product {
        protected boolean isSugarFree;

        public Candy(boolean isSugarFree) {
            this.isSugarFree = isSugarFree;
            setPrice(isSugarFree ? 25.0 : 30.0);
        }

    public enum Candy {
        SUGAR_FREE, SUGAR
    }

        @Override
        public String examine() {
            return "Examining" + (isSugarFree ? "sugar-free" : "sugar") + ("candy");

        }
        @Override
        public String use() {
            return "Eating " + (isSugarFree ? "sugar-free" : "sugar") + "candy.";

        }

        public boolean isSugarFree() {
            return isSugarFree;
        }

        public void setSugarFree(boolean isSugarFree) {
            this.isSugarFree = isSugarFree;
        }
 }

package solvd.laba.ecommerceapp;

class Promotion {
    public static double applyDiscount(double originalAmount, double discount) {
        return originalAmount - (originalAmount * discount / 100);
    }
}

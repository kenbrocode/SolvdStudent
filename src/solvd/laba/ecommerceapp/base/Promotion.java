package solvd.laba.ecommerceapp.base;

class Promotion {
    public static double applyDiscount(double originalAmount, double discount) {
        return originalAmount - (originalAmount * discount / 100);
    }
}

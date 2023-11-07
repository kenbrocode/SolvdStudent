package solvd.laba.ecommerceapp;

class StaticExample {
    static int staticVariable = 42;

    static {
        System.out.println("Static Block Executed");
    }

    public static void staticMethod() {
        System.out.println("Static Method Executed");
    }
}
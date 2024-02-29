package com.mountainwarehouse;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Challenge_1 test = new Challenge_1();
        double num = test.Discount(100,1);
        System.out.println(num);
    }
}

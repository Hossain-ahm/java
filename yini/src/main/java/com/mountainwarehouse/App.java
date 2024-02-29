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
        Challenge_4 test = new Challenge_4();
        double num = test.StampDuty(125000);
        System.out.println(num);
    }
}

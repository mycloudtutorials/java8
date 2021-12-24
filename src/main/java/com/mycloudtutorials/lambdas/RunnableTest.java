package com.mycloudtutorials.lambdas;

public class RunnableTest {
    public static void main(String[] args) {

        // prior to java 8
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("One...");
            }
        };

        new Thread(r1).start();

        // java 8

        Runnable r2 = () -> {
            System.out.println("Two..");
        };

        new Thread(r2).start();

        Runnable r3 = () -> System.out.println("Three..");
        new Thread(r3).start();

    }
}

package org.patterns.behavior.command.runnableExample;

public class TestRunnable {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("run!");

        Thread thread = new Thread(r);

        thread.start();
    }
}

package com.company;

public class StartThread extends Thread {
    StartThread startThread = new StartThread();
    static int i = 51;

    @Override
    public void run() {
        if (i < 50) {
            Thread thread1 = new StartThread();
            System.out.println(thread1.getName());


        } else {
            System.out.println("Too many threads");



        }
    }
}

package com.company;

public class StartThread extends Thread {
    static int i = 0;
    @Override
    public void run() {
        for  ( int i=50;i > 0; i--) {
            Thread thread1 = new StartThread();
            System.out.println(thread1.getName());






        }
    }
}

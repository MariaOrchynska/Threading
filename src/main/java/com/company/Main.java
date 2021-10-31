package com.company;

public class Main {
    public static void main(String[] args) {
//        Thread startThread1 = new StartThread();
//        startThread1.start();
Thread cs = new CustomThreds();
        System.out.println(cs.getName() + "Thread 2 is running");

cs.start();
        Thread t1 = new Custom2();
        System.out.println(t1.getName() + "Thread 1 is running");

        t1.start();



    }
    }




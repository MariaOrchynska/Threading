package com.company.task1;

public class StartThread1 extends Thread {
    static int i = 0;
    static int g=50;
    @Override
    public void run() {

if(i<50) {
    i++;
    System.out.println("Thread number " + g-- + "  created!");
    Thread thread1 = new StartThread1();
    thread1.start();
}else{
    System.out.println("");


//        for  ( int i=50;i > 0; i--) {
//            Thread thread1 = new StartThread();
//            System.out.println(thread1.getName());






        }
    }
}

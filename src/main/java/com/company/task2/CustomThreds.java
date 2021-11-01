package com.company.task2;

import com.company.task1.StartThread1;


public class CustomThreds extends Thread{
    ServerCoffee sc= new ServerCoffee();
String name;

    public ServerCoffee getSc() {
        return sc;
    }

    public void setSc(ServerCoffee sc) {
        this.sc = sc;
    }



    public CustomThreds(String name) {
        this.name=name;
start();
    }
    @Override
    public synchronized void run() {
sc.americano();
sc.capuccino();
sc.espresso();

    }

}

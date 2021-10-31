package com.company;

public class CustomThreds extends Thread{


    ServerCoffee sc = new ServerCoffee();
    @Override
    public void run() {
        sc.capuccino();
        sc.americano();
        sc.espresso();
    }
}

package com.company;

public class Custom2 extends Thread{


    ServerCoffee sc = new ServerCoffee();

    @Override
    public void run() {

        sc.espresso();
        sc.americano();
        sc.capuccino();
    }
}

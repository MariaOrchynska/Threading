package com.company.task2;


public class CoffeeMachine {
    int water =120;
    int coffee=120;
    int milk=120;
    int currentMilk;
    int currentWater;
    int currentCoffee;
    private final Object object = new Object();


public void sets(int water, int coffee, int milk){
    synchronized (object){
        currentMilk=milk;
        currentWater=water;
        currentCoffee=coffee;
    }
}


}

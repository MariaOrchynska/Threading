package com.company;

public class ServerCoffee extends CoffeeMachine{
    public void americano(){
          int result =waterA + coffeeA+milkA;
        System.out.println("Your americano is done with amount of liquid :"  + result);
    }
    public void espresso(){
        int result2 =waterE + coffeeA+milkE;
        System.out.println("Your espresso is done with amount of liquid :" +result2);
    }
    public void capuccino(){
        int result3 =waterK + coffeeK+milkK;
        System.out.println("Your capuccino is done with amount of liquid :" +result3);
    }
}

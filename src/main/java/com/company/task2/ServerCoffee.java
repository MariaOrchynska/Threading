package com.company.task2;

import com.company.task2.CoffeeMachine;
import lombok.Getter;
import lombok.Setter;

@Setter

@Getter
public class ServerCoffee extends CoffeeMachine {
    public void americano() {
        int result = (water - 20)+ (coffee -25)+(milk-43);
        System.out.println("Your americano is done with amount of liquid :" + result);
    }
    public void espresso(){
        int result2 =(water - 60)+ (coffee -35)+(milk-33);
        System.out.println("Your espresso is done with amount of liquid :" +result2);
    }
    public void capuccino(){
        int result3 =(water - 27)+ (coffee -29)+(milk-53);
        System.out.println("Your capuccino is done with amount of liquid :" +result3);
    }
}

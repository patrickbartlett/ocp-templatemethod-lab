package assignment.beforerefactoring.clientcode;

import assignment.beforerefactoring.*;
import example.afterrefactoring.HouseTemplate;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new Mocha();

        coffeeType.prepareCoffee();
        System.out.println("********************");

        coffeeType = new Cappucino();
        coffeeType.prepareCoffee();
        System.out.println("********************");

        coffeeType = new Americano();
        coffeeType.prepareCoffee();
        

    }

}

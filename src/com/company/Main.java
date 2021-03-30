package com.company;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        List<Coffee> coffee = new ArrayList<>();
        coffee.add(new Coffee("Latte", 130.00, 0));
        coffee.add(new Coffee("Espresso", 70.00, 1));
        coffee.add(new Coffee("Cappucino", 140.00, 2));
        coffee.add(new Coffee("Mocco", 90.00, 3));
        coffee.add(new Coffee("Americano", 100.00, 4));
        coffee.add(new Coffee("Frappe", 135.00, 5));
        coffee.add(new Coffee("IceCoffee", 125.00, 6));
        coffee.add(new Coffee("Cacao", 115.00, 7));
        coffee.add(new Coffee("Water", 20.00, 8));
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffee);
        coffeeMachine.On();
        coffeeMachine.Off();
    }
}






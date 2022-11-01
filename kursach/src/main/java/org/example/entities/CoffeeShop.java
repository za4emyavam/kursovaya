package org.example.entities;

public class CoffeeShop {
    public Coffee makeOrder(String coffeeType) throws IllegalArgumentException {
        if (coffeeType.equals("Cappuccino"))
            return new Cappuccino();
        else
            throw new IllegalArgumentException("There is no suck coffee type");
    }
}

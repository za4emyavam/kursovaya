package org.example;


import org.example.entities.Cappuccino;
import org.example.entities.CoffeeShop;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testCoffeeShop() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Assert.assertEquals(Cappuccino.class, coffeeShop.makeOrder("Cappuccino").getClass());
        Assert.assertThrows(IllegalArgumentException.class,() -> coffeeShop.makeOrder("asdasdd"));
    }
}

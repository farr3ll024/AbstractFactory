package com.company.test;

import com.company.Factory.BasePizzaFactory;
import com.company.Factory.GourmetPizzaFactory;
import com.company.Product.Pizza;
import org.junit.Test;

public class GourmetPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}

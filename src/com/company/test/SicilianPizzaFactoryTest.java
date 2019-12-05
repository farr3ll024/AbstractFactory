package com.company.test;

import com.company.Factory.BasePizzaFactory;
import com.company.Factory.SicilianPizzaFactory;
import com.company.Product.Pizza;
import org.junit.Test;

public class SicilianPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}

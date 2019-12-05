package com.company.Factory;

import com.company.Product.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}

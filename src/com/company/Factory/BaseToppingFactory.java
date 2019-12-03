package com.company.Factory;

import com.company.Topping.ICheese;
import com.company.Topping.ISauce;

public abstract class BaseToppingFactory {
    public abstract ICheese createCheese();

    public abstract ISauce createSauce();
}

package com.company.Factory;

import com.company.Topping.ICheese;
import com.company.Topping.ISauce;
import com.company.Topping.MozzarellaCheese;
import com.company.Topping.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory {
    @Override
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public ISauce createSauce() {
        return new TomatoSauce();
    }
}

package com.company.Factory;

import com.company.Topping.CaliforniaOilSauce;
import com.company.Topping.GoatCheese;
import com.company.Topping.ICheese;
import com.company.Topping.ISauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public ICheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public ISauce createSauce() {
        return new CaliforniaOilSauce();
    }
}

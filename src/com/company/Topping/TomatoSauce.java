package com.company.Topping;

public class TomatoSauce implements ISauce {
    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce...");
    }
}

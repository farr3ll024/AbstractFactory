package com.company.Topping;

public class CaliforniaOilSauce implements ISauce {
    public CaliforniaOilSauce(){
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce...");
    }
}

package com.company.Topping;

public class GoatCheese implements ICheese{
    public GoatCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese...");
    }
}

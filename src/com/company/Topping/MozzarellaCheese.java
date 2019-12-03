package com.company.Topping;

public class MozzarellaCheese implements ICheese {
    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}

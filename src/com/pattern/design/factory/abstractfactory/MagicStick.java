package com.pattern.design.factory.abstractfactory;

public class MagicStick extends Weapon{
    @Override
    public void shoot() {
        System.out.println("武器：魔法棒-->哒哒哒射击！");
    }
}

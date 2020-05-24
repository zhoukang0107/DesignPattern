package com.pattern.design.factory.abstractfactory;

public class MagicFactory01{
    public Broom createBroom(){
        return new Broom();
    }

    public MagicStick createMagicStick(){
        return new MagicStick();
    }

    public MushRoom createMushRoom(){
        return new MushRoom();
    }

}

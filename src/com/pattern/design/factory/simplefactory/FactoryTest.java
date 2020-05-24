package com.pattern.design.factory.simplefactory;

import com.pattern.design.factory.simplefactory.BroomFactory;
import com.pattern.design.factory.simplefactory.Moveable;
import com.pattern.design.factory.simplefactory.VehicleFactory;

public class FactoryTest {
    public static void main(String[] args){
       /* PlaneFactory factory = new PlaneFactory();
        Moveable plane = factory.create();
        plane.run();*/
        //VehicleFactory factory = new CarFactory();
        VehicleFactory factory = new BroomFactory();
        Moveable moveable = factory.create();
        moveable.run();

    }
}

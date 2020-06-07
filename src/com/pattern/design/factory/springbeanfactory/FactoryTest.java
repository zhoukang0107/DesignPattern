package com.pattern.design.factory.springbeanfactory;


import java.io.IOException;
import java.util.Properties;

public class FactoryTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
       //Moveable m = new Car();
        Properties pros = new Properties();
        pros.load(FactoryTest.class.getClassLoader().getResourceAsStream("com/pattern/design/factory/springbeanfactory/spring.properties"));

        String vehicleTypeName = pros.getProperty("VehicleType");
        Moveable object = (Moveable)Class.forName(vehicleTypeName).newInstance();
        object.run();

    }
}

package com.pattern.design.decorator;

public class StartBuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso(); //不需要调料，打印出他的描述与价格
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        beverage = new DarkRoast(); //制造一个DarkRoat对象
        beverage = new Mocha(beverage); //用mocha装饰
        beverage = new Mocha(beverage); //用第二个mocha装饰
        beverage = new Whip(beverage);//用Whip装饰
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        beverage = new HoseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
    }
}

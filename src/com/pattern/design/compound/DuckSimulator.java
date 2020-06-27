package com.pattern.design.compound; /***********************************************************************
 * Module:  DuckSimulator.java
 * Author:  Zack
 * Purpose: Defines the Class DuckSimulator
 ***********************************************************************/

/**
 * 我们做了什么?
 *
 * 我们从一大堆Quackable开始·
 *
 * 有一只鹅出现了，它希望自己像一个Quackable
 * 所以我们利用适配器模式，将鹅适配成Quackable现在你就可以调用鹅适配器的quack()方法来让鹅咯咯叫。
 *
 * 然后，呱呱叫学家决定要计算呱呱叫声的次数。
 * 所以我们使用装饰者模式，添加了一个.名为QuackCounter的装饰者。它用来追踪quack()
 * 被调用的次数，并将调用委托给它所装饰的Quackable对象。
 *
 * 但是呱呱叫学家担心他们忘了加上QuackCounter装饰者。
 * 所以我们使用抽象工厂模式创建鸭子，从此以后，当他们需要鸭子时，就直接跟工厂要、
 * 工厂会给他们装饰过的鸭子(别忘了，如果他们想取得没装饰的鸭于，用另一个鸭子工厂就可以!〕
 *
 * 又是鸭子，又是鹅，又是Quackable的......我们有管理上的困扰。
 * 所以我们需要使用组合模式，将许多Quackable集结成一个群。这个模式也允许群中有群,
 * 以便让呱呱叫家来管理鸭子家族。我们在实现中通过使用ArrayList中java.util的迭代器
 * 而使用了迭代器模式。
 *
 * 当任何呱呱声响起时，呱呱叫学家都希望能被告知。
 * 所以我们使川观察者模式，让呱呱叫学家沈册成为观察者。现在，当呱呱声响起时，呱呱
 * 叫学家就会被通知。在这个实现中，我们再度用到了迭代器。呱呱叫学家不仅可以当某个
 * 鸭子的观察者。其至可以当一整群的观察者。
 *
 */

/** @pdOid 19c00f75-090b-40cd-8393-8072a9779c33 */
public class DuckSimulator {

   public static void main(String[] args) {
      // TODO: implement
      /**
       *
       */
      //DuckSimulator simulator = new DuckSimulator();
      //simulator.simulate();

      /**
       * 4、使用抽象工厂创建鸭子
       */
      DuckSimulator simulator = new DuckSimulator();
      AbstractDuckFactory factory = new CountingDuckFactory();
      simulator.simulate(factory);
   }

   private void simulate() {
      /*//1、模拟鸭子呱呱叫
      Quackable duckCall = new DuckCall();
      Quackable mallardDuck = new MallardDuck();
      Quackable redheadQuack = new RedheadQuack();
      Quackable rubberDuck = new RubberDuck();

      System.out.println("\nDuck simulator**************");

      simulate(duckCall);
      simulate(mallardDuck);
      simulate(redheadQuack);
      simulate(rubberDuck);*/

/*      //2、模拟鸭子呱呱叫,增加鹅适配器(适配器模式)
      Quackable duckCall = new DuckCall();
      Quackable mallardDuck = new MallardDuck();
      Quackable redheadQuack = new RedheadQuack();
      Quackable rubberDuck = new RubberDuck();
      Quackable goose = new GooseAdapter(new Goose());
      System.out.println("\nDuck simulator**************");

      simulate(duckCall);
      simulate(mallardDuck);
      simulate(redheadQuack);
      simulate(rubberDuck);
      simulate(goose);*/

   /*   //3、模拟鸭子呱呱叫,增加鹅适配器（适配器模式）,增加统计鸭子叫次数统计（装饰模式）
      Quackable duckCall = new QuackCounter(new DuckCall());
      Quackable mallardDuck = new QuackCounter(new MallardDuck());
      Quackable redheadQuack = new QuackCounter(new RedheadQuack());
      Quackable rubberDuck = new QuackCounter(new RubberDuck());
      Quackable goose = new GooseAdapter(new Goose());
      System.out.println("\nDuck simulator**************");

      simulate(duckCall);
      simulate(mallardDuck);
      simulate(redheadQuack);
      simulate(rubberDuck);
      simulate(goose);
      System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");*/

      //模拟鸭子呱呱叫,增加鹅适配器（适配器模式）,增加统计鸭子叫次数统计（装饰模式）
      Quackable duckCall = new QuackCounter(new DuckCall());
      Quackable mallardDuck = new QuackCounter(new MallardDuck());
      Quackable redheadQuack = new QuackCounter(new RedheadQuack());
      Quackable rubberDuck = new QuackCounter(new RubberDuck());
      Quackable goose = new GooseAdapter(new Goose());
      System.out.println("\nDuck simulator**************");

      simulate(duckCall);
      simulate(mallardDuck);
      simulate(redheadQuack);
      simulate(rubberDuck);
      simulate(goose);
      System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
   }

   private void simulate(AbstractDuckFactory factory) {
      //模拟鸭子呱呱叫,增加鹅适配器（适配器模式）,使用抽象工厂创建鸭子
     /* Quackable duckCall = factory.createDuckCall();
      Quackable mallardDuck = factory.createMallardDuck();
      Quackable redheadQuack = factory.createRedheadDuck();
      Quackable rubberDuck = factory.createRubberDuck();
      Quackable goose = new GooseAdapter(new Goose());
      System.out.println("\nDuck simulator**************");

      simulate(duckCall);
      simulate(mallardDuck);
      simulate(redheadQuack);
      simulate(rubberDuck);
      simulate(goose);
      System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");*/

      /**
       * 6、组合模式，管理鸭子集合
       */
      Quackable duckCall = factory.createDuckCall();
      Quackable mallardDuck = factory.createMallardDuck();
      Quackable redheadQuack = factory.createRedheadDuck();
      Quackable rubberDuck = factory.createRubberDuck();
      Quackable goose = new GooseAdapter(new Goose());
      System.out.println("\nDuck simulator：with composite - flocks");

      Flock flockDuck = new Flock();//主群
      flockDuck.add(duckCall);
      flockDuck.add(mallardDuck);
      flockDuck.add(redheadQuack);
      flockDuck.add(rubberDuck);
      System.out.println("\nDuck simulator：with observer");
      Quackologist quackologist = new Quackologist();
      flockDuck.register(quackologist);


      Flock flockMallards = new Flock();  //mallard子群
      flockMallards.add(factory.createMallardDuck());
      flockMallards.add(factory.createMallardDuck());
      flockMallards.add(factory.createMallardDuck());
      flockMallards.add(factory.createMallardDuck());

      flockDuck.add(flockMallards);  //将mallard加入主群
      System.out.println("\nDuck simulator：whole flock simulatation");

      simulate(flockDuck); //测试一整群

      System.out.println("\nDuck simulator：mallard flock simulatation");

      simulate(flockMallards); //测试mallard群

      System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
   }


   private void simulate(Quackable quackable) {
      quackable.quack();
   }
}
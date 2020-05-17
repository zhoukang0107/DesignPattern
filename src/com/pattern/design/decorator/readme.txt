装饰者模式——给爱用继承的人一个全新的设计眼界
不修改任何底层代码的情况下，给你的对象赋予新的职责；

设计原则：类应该对扩展开放，对修改关闭
允许类在不修改现有代码的情况下，就可以搭配新的行为，既然没有修改现有代码，那么引进BUG或者产生意外副作用的机会将大幅度减少。
让OOM设计同时具备开放性和关闭性，又不修改现有代码，需要花费许多时间和努力。一般来说，我们实在没有功夫把设计的每一个部分都这么设计（而且就算做到，也可能只是一种浪费），遵循开放-关闭原则，通常会引入新的抽象层次，
增加代码的复杂度。你需要把注意力集中在设计中最有可能改变的地方，然后应用开闭原则。


装饰者模式：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更富有弹性的替代方案。
1、装饰者和被装饰者具有相同的超类型；
2、你可以用一个或多个装饰者包装一个对象；
3、既然装饰者和被装饰者对象具有相同的超类型，所以在任何需要原始对象（被包装的）的场合，可以用装饰过的对象替代他；
4、装饰者可以在所委托被装饰者的行为之前或之后，加上自己的行为，以达到特定的目的；
5、对象可以在任何时候被装饰。可以在运行时动态地、不限量地用你喜欢的装饰者来装饰；

星巴兹的咖啡：
需求背景：由于点苦扩展太快，咖啡口味种类增多，即需对订单系统做升级，以合乎饮料供应要求，购买咖啡时，可以要求在其中加入各种调料，例如：蒸奶、豆浆、摩卡或覆盖奶泡等，星巴兹会根据所加入的调料收取不同的费用，所以订单系统必须考虑到这些调料部分：

方案1：
1、定义饮料抽象类Beverage,店内所有提供的饮料必须继承自此类；
public class Beverage{
private String description;
public String getDescription();   //这个名为description的实例变量，由每个子类设置，用来描述饮料，例如：“超优深培”咖啡豆，利用getDescription放回此叙述；
public abstruct int cost();   //cost抽象的，子类必须定义自己的实现
}
//根据不同调料配置，定义不同咖啡子类；
public class HouseBlend extends Beverage{
    cost();  //每个cost方法将计算出咖啡上订单上各种调料价格
}

public class DarkRoast extends Beverage{
    cost();
}

public class Decaf extends Beverage{
    cost();
}

publlic class Espresso extends Beverage{
    cost();
}
不同调料配置定义不同咖啡，将会造就一个维护噩梦，调料价格上升、调料的增减都造成现有类的大面积修改，同时也会造成类数量的爆炸；
2、以调料为主体，然后运行时以调料来“装饰”饮料，比如说顾客想要摩卡和奶泡深培咖啡，需要做的如下：
(1)、拿一个深培咖啡（DarkRoast）对象
//原始对象
class DarkRoast extends Beverage{
    cost()
}
(2)、以摩卡（Mocha）对象装饰它
//装饰对象
class Mocha extends Beverage{
Beverage beverage;  //DarkRoast对象
price;
    cost(){
        return price + beverage.cost();  //自己价格加上被装饰对象价格即为实际价格
    }
}
Mocha装饰DarkRoast：Mocha{DarkRoast}
(3)、以奶泡对象装饰它
class Whip extends Beverage{
Beverage beverage;  //Mochat对象
price;
    cost(){
        return price + beverage.cost();
    }
}
Whip装饰Mocha：Whip{Mocha{DarkRoast}}
(4)、调用cost方法，并依赖委托（delegate）将调料的价格加上去
通过最外圈的装饰者(Whip)的cost就可以实现价格的计算：
Whip价格：Whip的价格+委托对象价格（Mocha的价格）
Mocha价格：Mocha的价格+委托对象的价格（DarkRoast的价格）
DarkRoast价格：原始对象价格


装饰模式要点：
1、在我们的设计中，应该允许行为可以被扩展，而无需修改现有代码；
2、组合和委托可用于在运动时动态地加上新的行为；
3、装饰者类反映出被装饰的组件类型（事实上，他们具有相同的类型，都经过接口或者继承实现）；
4、装饰模式可以在被装饰者的行为前面或者后面加上自己的行为，甚至将整个取代掉，而达到特定的目的；
5、你可以用无数个装饰者包装一个组件；
6、装饰者一般对组件的客户是透明的，客户甚至不需要知道他在和装饰者打交道，除非客户程序依赖于组件的具体类型；
7、装饰者会导致设计中出现许多小对象，如果过度使用，会让程序变得很复杂；加入大量的小类偶尔会导致别人不容易了解我们的设计方式；
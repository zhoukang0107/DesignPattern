设计模式分类：
创建型：涉及到将对象实例化、这类模式都提供一个方法，将客户从所需要实例化的对象中解耦；
工厂方法、抽象工厂、单例
行为型：涉及到类和对象如何交互以及分配职责
模板方法、迭代器、观察者模式、状态模式、命令模式、策略模式
结构型：把类或对象组合到更大的结构中
装饰者模式、组合模式、外观模式、代理模式、桥接模式

注意事项：
1、让设计模式自然而然地出现在你的设计中，而不是为了使用而使用。
   为实际需要的扩展使用模式，不要只是为了假想的需要而使用模式；
2、设计模式并非僵化的教条;你可以依据自己的需要采用或调整。
   模式是工具，而不是规则，需要被适当的调整以符合你的需要；
   我们可以改变模式，就像设计原则一样，模式不是法律或者准则，模式只是指导方针，我们可以改变模式来符合我们的需求；当我们改变模式的时候，最好能够标注出它与经典模式的差异，以便其他人能够快速识别；
3、总是使用满足需要的最简羊解决方案，不管它用不用模式。
   简单才是王道，如果你不用模式就能涉及出更简单的方案，那就去干吧；
4、模式能够为你带来的最大好处之一是:让你的团队拥有共亨词汇。

替告:过度使用设计模式可能导致代码披过度工程化。应该总是用最简单的解决方案完成工作，并在真正需要模式的地方才使用它。

剩下的模式（摘抄）：

桥接模式：
桥接模式通过将实现和抽象放在两个不同的类层次中而使它们可以独立改变。
优点：
将实现予以解藕。让它和界面之间不再永久绑定。
抽象和实现可以独立扩展，不会影响到对方。
对于“具体的抽象类”所做的改变，不会影响到客户。
用途和缺点：
适合使用在需要跨越多个平台的图形和窗口系统上。
当需要用不同的方式改变接口和实现时，你会发现桥接模式很好用。
桥接模式的缺点是增加了复杂度。

构造器模式：
使用生成器模式(Bui}}r Pattern封装一个产品的构造过程，并允许按步骤构造。
优点：
将一个复杂对象的创建过程封装起来。
允许对象通过多个步骤来创建，并且可以改变过程(这和只有一个步骤的工厂模式不同)。
向客户隐藏产品内部的表现。
产品的卖现可以被替换，因为客户只看到一个抽象的接口。
用途和缺点：
经常被用来创建组合结构。
与工厂模式相比，采用生成器模式创建对象的客户，需要具备更多的领域知识。

责任链：
当你想要让一个以上的对象有机会能够处理某个请求的时候，就使用责任链模式。
优点：
将请求的发送者和接受者解耦，可以简化你的对象，因为它不需要知道链的结构。通过改变链内的成员或调动它们的次序，允许你动态地新增或者删除责任。
用途和缺点：
经常被使用在窗口系统中，处理鼠标和键盘之类的事件。
并不保证请求一定会被执行、如果没有任何象处理它的话，它可能会落到链尾端之外〔这可以是优点也可以是缺点〕。
可能不容易观察运行时的特征，有碍干除错。

Flyweight Pattern（享元模式）：
如想让某个类的一个实例能用来提供许多“虚拟实例”，使用享元模式；
优点：
减少运行时对象实例的个数、节省内存。
将许多“虚拟”对象的状态集中管理
用途和缺点：
当一个类有许多的实例，而这些实例能被同一方法控制的时候。我们就可以使用享元模式。
享元模式的缺点在干，一旦你实现了它，那么单个的逻辑实例将无法拥有独立而不同的行为。

解释器：
使用解释器模式为语言创建解释器。
优点：
用途和缺点：

中介者：
使用中介者模式来集中相关对象之间复杂的沟通和控制方式。
众多对象之间关系彼此错综复杂，在这个系统中加入一个中介者，一切都变得简单。
每个对象都会在白已的状态改变时，告诉中介者。
每个对象都会对中介者所发出的请求作出回应。
在没有中介者的情况，所有的对象都需要认识其他对象......也就是说，对象之间是紧耦合的。有了中介者之后，对象之间彻底解祸。
中介者内包含了整个系统的控制逻辑。当某装置需要一个新的规则时，或者是一个新的装置被加人系统内，其所有需要用到的逻辑也都被加进了中介者内。


优点：
通过将对象彼此解耦，可以增加对象的复用性。
通过将控制逻辑集中，可以简化系统维护。
可以让对象之间所传递的消息变得简羊而且大幅减少。
用途和缺点：
中介者常常破用来协调相关的GUI组件。
中介者模式的缺点是，如果设计不当，中介者对象本身会变得过于复杂。

备忘录：
当你需要让对象返回之前的状态时(例如，你的用户请求“撤销”)就使用备忘录模式。
优点：
将被储存的状态放在外面，不要和关键对象混在一起，这可以帮助维护内聚。
保持关键对象的数据封装。
提供了容易实现的恢复能力。
用途和缺点：
备忘录用手储存状态。
使用备忘录的缺点:储存和恢复状态的过程可能相当耗时。
在java系统中，其实可以考虑使用序列化机制储存系统的状态。

原型：
当创建给定类的实例的过程很昂贵或很复杂时，就使用原型模式。

访问者：
当你想要为一个对象的组合增加新的能力，且封装并不重要时，就使用访问者模式。
优点：
允许你对组合结构加入新的操作，而无需改变结构本身。
想要加入新的操作，相对容易。
访间者所进行的操作，其代码是集中在一起的。
用途和缺点：
当采用访问者摸式的时候就会打破组合类的封装。
因为游走的功能牵涉其中，所以对组合结构的改变就更加困难。









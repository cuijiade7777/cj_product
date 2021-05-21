#设计模式

面向对象的特点是可维护、可复用、可扩展、灵活性好，它真正强大的地方在于：随着业务变的越来越复杂，面向对象依然能够使得程序结构良好，而面向过程却致使程序越来越臃肿。

让面向对象保持结构良好的秘籍就是 设计模式

####设计模式基于六大原则：

1.开闭原则：一个软件实体如类、模块和函数应该对修改关闭，对扩展开放  
2.单一职责原则：一个类只做一件事，一个类应该只有一个修改它的原因  
3.里氏替换原则：子类应该可以完全替换父类。也就是说在使用继承时，只扩展新功能，而不要破坏父类原有的功能    
4.依赖倒置原则：细节应该依赖于抽象，抽象不应依赖于细节。把抽象层放在程序的最高层，并保持稳定，程序的细节变化由低层的实现层来完成  
5.迪米特法则：有名「最少知道原则」，一个类不应知道自己操作的类的细节  
6.接口隔离原则：客户端不应依赖它不需要的接口，如果一个接口在实现时，部分接口由于冗余被客户端空实现，则应该将接口拆分，让实现类只需依赖自己需要的接口方法


平时编程中，构建对象最常用的方式是new一个对象。乍一看没什么不好，而实际上这也属于一种硬编码，每new一个类，相当于调用者多知道了一个类，增加了类与类之间的联系，不利于程序的松耦合，其实构建过程可以被封装起来，工厂模式便是用于封装对象的设计模式


####设计模式中英文对照

简单工厂模式 Simple Factory Pattern

1.工厂方法模式	Factory Method Pattern  
2.抽象工厂模式	Abstract Factory Pattern  
3.建造者模式	Builder Pattern  
4.原型模式	Prototype Pattern  
5.单例模式	Singleton Pattern  
6.适配器模式	Adapter Pattern  
7.桥梁模式/桥接模式	Bridge Pattern  
8.组合模式	Composite Pattern  
9.装饰模式	Decorator Pattern  
10.门面模式/外观模式	Facade Pattern  
11.享元模式	Flyweight Pattern  
12.代理模式	Proxy pattern  
13.责任链模式	Chain of Responsibility Pattern  
14.命令模式	Command Pattern  
15.解释器模式	Interpreter Pattern  
16.迭代器模式	Iterator Pattern  
17.中介者模式	Mediator Pattern  
18.备忘录模式	Memento Pattern  
19.观察者模式	Observer Pattern  
20.状态模式	State Pattern  
21.策略模式	Strategy Pattern  
22.模板方法模式	Template Method Pattern  
23.访问者模式	Visitor Pattern  

参考博客：https://www.zhihu.com/question/308850392



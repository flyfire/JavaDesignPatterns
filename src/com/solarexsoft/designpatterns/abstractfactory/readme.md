简单工厂模式就是可以根据传入的参数的不同，返回不同的对象。

也就是说，需要创建什么类，那么就调用工厂方法的对应创建方法，并且传入一个参数，工厂方法就会根据该参数创建合适的对象。 那么具体工厂方法如何判断，其实就是 if-else，或者 switch。

缺点：

+ 如果需要新添加条件，那么只能加 if-else 或者 switch 加 case。这就是硬编码，也违反了开闭原则。
+ 条件过多，那么就不利于维护。所以使用在条件不多的情况下。

工厂方法模式即是对简单工厂模式的改进。我们首先需要定义一个抽象的工厂类，然后会有 N 多个具体工厂类来继承抽象工厂类，这些具体的工厂类负责生成具体的对象。

那么，这样做有什么好处呢？答：这样当我们引进新的类型的时候，就不需要修改原有的东西，我们只需要添加新的具体工厂类，继承于抽象工厂类即可。这样做也更符合开闭原则。

缺点：类的个数增多。优点：符合开闭，容易扩展。

为什么这样说呢，就是你不再需要改 if else，或者 switch 了。直接 new 你要的工厂，利用工厂来创建你想要的对象即可。

这个时候可能有个疑问，既然是一个工厂对应一个目标对象，那我还要工厂干嘛，我直接 new 我的目标对象不就可以了。

这个时候需要考虑一个问题，就是假如我需要创建3个对象，那么就是比如：

```
Person a = new Student();
Person b = new Student();
Person c = new Student();
```

那么此时我不想要 Student了，想把 Student 换成 Teacher，此时是不是要改动3处。

那么，这个时候有个工厂方法模式好在哪呢？

```
PersonFactory pf = new StudentFactory();
Person a = pf.createInstance();
Person b = pf.createInstance();
Person c = pf.createInstance();
```
此时如果想换成 Teacher，那么就改``PersonFactory pf = new TeacherFactory();``一处就可以了。

另外，别忘了，你在加 Teacher 的时候，是符合开闭原则的，而简单工厂模式是不符合的。

抽象工厂模式主要能实现 很多不同的类的修改。

像上述的简单工厂模式或者说工厂方法模式，都是

```PersonFactory pf = new StudentFactory();```
改成

```PersonFactory pf = new TeacherFactory();```
这种，这都是属于一个类的修改。比如说，不仅仅要把学生改成老师，还要把学生上课时间改成老师上课时间，这样就需要再加一个

```ClassTimeFactory pf = new StudentClassTimeFactory();```
改成

```ClassTimeFactory pf = new TeacherClassTimeFactory();```
这样就有两处修改了，那么，抽象工厂模式就能弄成一处修改，好就好在这里。比如说：

```
Factory factory = new StudentFactory();
Person a = factory.createPersonInstance();
ClassTime ct = factory.createClassTimeInstance();
```
这样，当需要把学生的东西改成老师的东西的时候，就直接

```
Factory factory = new StudentFactory();
```
改成

```
Factory factory = new TeacherFactory();
```
就只是改一开始的一处就可以了。后面两处：
```
Person a = factory.createPersonInstance();
ClassTime ct = factory.createClassTimeInstance();
```
都不需要修改。


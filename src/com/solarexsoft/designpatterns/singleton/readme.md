使用synchronized修饰的getInstance方法，每次调用都会进行同步，即使sInstance已经被初始化了。

DoubleCheckLock模式，``sInstance = new Singleton()``，不是原子操作，可分为3件事情
+ 给Singleton的实例分配内存
+ 调用Singleton()的构造函数，初始化成员字段
+ 将sInstance对象指向分配的内存空间

如果不适用volatile关键字修饰sInstance，由于Java编译器允许乱序执行，以及JDK1.5之前JMM中cache、寄存器到主内存回写顺序的规定，上面的第二和第三的顺序是无法保证的。

就是说，执行顺序可能是1-2-3也可能1-3-2，若是后者，并且在3执行完毕、2未执行之前，线程切换到B上，此时sInstance因为已经在线程A执行过3，sInstance已经非空了，所以，线程B直接取走sInstance，在使用时会出错，因为Singleton的成员变量还没有初始化。

JDK1.5之后，只要将sInstance修饰为volatile，就可以保证可见性，每次都从主内存中读取，并且禁止乱序执行。

InitalizingOnDemandHolder按需加载，可以确保线程安全，同时保证了实例对象的唯一性，同时也延迟了单例的初始化，是推荐使用的单例实现方式。

枚举在Java中与普通的类是一样的，不仅能够有字段，还能够有自己的方法，最重要的是默认枚举实例的创建时线程安全的，并且在任何情况下都是一个单例。

通过反序列化可以加一个单例的实例对象写到磁盘再读回来从而有效的获取一个实例，即使构造函数是私有的，反序列化时依然可以通过特殊的途径去创建类的一个新的实例，相当于调用该类的构造函数，反序列化操作提供了一个很特别的hook函数，类中具有一个私有的，被实例化的方法readResolve()，这个方法可以让开发人员控制对象的反序列化。

```
private Object readResolve() throws ObjectStreamException {
    return sInstance;
}
```
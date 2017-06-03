什么是观察者模式： 多个观察者去监听主题，当主题发生变化的时候，主题会通知所有的观察者。

![](https://ws2.sinaimg.cn/large/006tNc79ly1fg7v325fyij30hg06xt8s.jpg)

主题维护了一个观察者类型的链表，每当主题变化的时候，就会循环调用（例如使用for循环）各个观察者的对应方法（这就是通知）。

在观察者模式中，又分为 推模型 和 拉模型。

- 推模型：主题向观察者推送详细信息。
- 拉模型：主题把自身作为一个参数发送给观察者，观察者需要什么信息，那么就 主题.getXX() 。

好处：这样可以看到，被观察者不关心观察者是如何处理的，这样有利于处理成松耦合；另外，有时候观察者需要调用第三方进行支持，可能比较慢，此时也可以做成异步的。

Observable 接口（被观察者接口 / 主题接口）：

```
public class Observable {  
    private boolean changed = false;  
    private Vector<Observer> obs;  
    public Observable() {  
        obs = new Vector<>();  
    }  
    public synchronized void addObserver(Observer o) {  
        if (o == null)  
            throw new NullPointerException();  
        if (!obs.contains(o)) {  
            obs.addElement(o);  
        }  
    }  
    public synchronized void deleteObserver(Observer o) {  
        obs.removeElement(o);  
    }  
    public void notifyObservers() {  
        notifyObservers(null);  
    }  
    public void notifyObservers(Object arg) {  

        Object[] arrLocal;  

        synchronized (this) {  
            if (!changed)  
                return;  
            arrLocal = obs.toArray();  
           ·            clearChanged();  
        }  

        for (int i = arrLocal.length-1; i>=0; i--)  
            ((Observer)arrLocal[i]).update(this, arg);  
    }  

    public synchronized void deleteObservers() {  
        obs.removeAllElements();  
    }  
    protected synchronized void setChanged() {  
        changed = true;  
    }  
    protected synchronized void clearChanged() {  
        changed = false;  
    }  
    public synchronized boolean hasChanged() {  
        return changed;  
    }  
    public synchronized int countObservers() {  
        return obs.size();  
    }  
} 
```

通过 Vector 维护一个 观察者类型的数组。通过调用 notifyObeservers(Object arg) 方法 来通过观察者。在实现中，也是通过for 循环 通知。
Ps：注意：从代码上看，需要先设changed。

Observer接口（观察者接口）：

```
public interface Observer {  
    void update(Observable o, Object arg);  
} 
```

这两个参数的含义为：
```
* @param   o     the observable object.  
* @param   arg   an argument passed to the <code>notifyObservers</code>  
```

所以，此时即实现了 推模型，也实现了 拉模型。如果我们使用，那么分别实现这两个接口即可。

这里需要注意一点，这里并不能实现完全的解耦，这里只是一种松耦合。

观察者模式实质是 有两个 东西：

- 一个是 主题
- 一个是观察者

主题中维护了 观察者列表的引用。当主题有变更的时候，循环调用观察者，通知其做相应的处理。
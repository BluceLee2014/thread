package com.moolng.thread.case003;

/**
 * @author 543232022@qq.com
 * @description 创建一个让动物线程停止的类，这里要实现回调接口
 * @date 2020/12/2 13:06
 */
public class LetOneStop implements Animal.Calltoback {
    // 动物对象
    Animal an;
    
    // 获取动物对象，可以传入兔子或乌龟的实例
    public LetOneStop(Animal an) {
        this.an = an;
    }
    
    // 让动物的线程停止
    @Override
    public void win() {
        // 线程停止
        an.stop();
    }
    
    
    
}

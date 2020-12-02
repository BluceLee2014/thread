package com.moolng.thread.case001;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 543232022@qq.com
 * @description 执行类
 * @date 2020/12/2 11:37
 */
public class MainClass {
    
    /**
     * java多线程同步锁的使用
     * 示例：三个售票窗口同时出售10张票
     * */
    public static void main(String[] args) {
        AtomicInteger inventoryNum = new AtomicInteger(20);
        // 实例化站台对象，并为每一个站台取名字
        Station station1 = new Station("窗口1", inventoryNum);
        Station station2 = new Station("窗口2", inventoryNum);
        Station station3 = new Station("窗口3", inventoryNum);
        // 让每一个站台对象各自开始工作
        station1.start();
        station2.start();
        station3.start();
    }
}

package com.moolng.thread.case001;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 543232022@qq.com
 * @description
 * @date 2020/12/2 11:33
 */
public class Station extends Thread{
    // 为了保持票数的一致，票数要静态（模拟票数）
//    static int tick = 20;
    AtomicInteger inventoryNum;
    // 创建一个静态钥匙
    static Object lock = "lock"; // 值是任意的
    
    // 通过构造方法给线程名字赋值
    public Station(String name, AtomicInteger inventoryNum) {
        super(name);
        this.inventoryNum = inventoryNum;
    }
    
    @Override
    public void run() {
        while (inventoryNum.get() > 0) {
            synchronized (lock) {// 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if (inventoryNum.get() > 0) {
                    System.out.println(getName() + " 卖出了第" + inventoryNum.get() + "张票");
                    inventoryNum.getAndDecrement();
                } else {
                    System.out.println("票卖完了");
                }
            }
            try {
                sleep(1000); // 休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

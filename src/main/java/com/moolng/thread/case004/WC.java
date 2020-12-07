package com.moolng.thread.case004;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author 543232022@qq.com
 * @description
 * @date 2020/12/7 18:15
 */
public class WC extends Thread {
    private String name;
    private Semaphore wc;
    
    public WC(String name, Semaphore wc) {
        this.name = name;
        this.wc = wc;
    }
    
    @Override
    public void run() {
        int availablePermit = wc.availablePermits();
        if (availablePermit > 0) {
            System.out.println(name+",好开心啊，我终于有坑了");
        }else {
            System.out.println(name+"怎么没有坑了。。。");
        }
        
        try {
            wc.acquire();
            System.out.println(name+",好开心啊，我终于抢到了！");
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(name+",好爽啊，终于上完了！");
            wc.release();
        } catch (InterruptedException e) {
        
        }
    }
    
    
}

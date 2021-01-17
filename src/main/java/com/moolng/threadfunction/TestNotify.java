package com.moolng.threadfunction;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2021/1/17 14:01
 */
public class TestNotify {

    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread((()->{
            System.out.println("thread A is waiting to get lockk");
            synchronized (lock) {
                try {
                    System.out.println("thread A get lock");
                    Thread.sleep(20);
                    System.out.println("thread A do wait method");
                    lock.wait();
                    System.out.println("thread A is done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        })).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            System.out.println("thread B is waiting to get lockk");
            synchronized (lock) {
                try {
                    System.out.println("thread B get lock");
                    System.out.println("thread B is sleeping 10ms");
                    Thread.sleep(10);
                    System.out.println("thread B is done");
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}

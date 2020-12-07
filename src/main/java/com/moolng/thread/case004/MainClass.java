package com.moolng.thread.case004;

import java.util.concurrent.Semaphore;

/**
 * @author 543232022@qq.com
 * @description
 * @date 2020/12/7 18:17
 */
public class MainClass {
    
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            WC wc = new WC("第" + i + "个人", semaphore);
            wc.start();
        }
    }
}

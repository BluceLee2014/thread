package com.moolng.thread.case002;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author 543232022@qq.com
 * @description
 * @date 2020/12/2 11:59
 */
public class MainClass {
    
    public static void main(String[] args) {
        AtomicReference<BigDecimal> bigDecimalAtomicReference = new AtomicReference<BigDecimal>();
        Bank bank = new Bank();
        // 实例化两个人，传入同一个银行的对象
        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank, "ATM");
        a.start();
        b.start();
    }
    
}

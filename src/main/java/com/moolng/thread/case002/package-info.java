package com.moolng.thread.case002;

/**
 * 案例二
 * 场景：两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！
 * 来源 https://blog.csdn.net/qq_34996727/article/details/80416277
 *
 * 案例总结：
 *（1）代码块锁是一个防止数据发生错误的一个重要手段；
 *（2）对象的统一性是非常重要的，这要想到对象的传入问题，要操作的对象只能new一次，其他的操作都是对这个传入的对象进行的，才能保证数据一致性，完整性和正确性。
 */

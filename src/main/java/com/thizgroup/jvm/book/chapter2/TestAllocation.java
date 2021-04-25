package com.thizgroup.jvm.book.chapter2;

/**
 * -verbose:gc 表示在控制台输出gc的情况
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * 测试老年代的分配担保
 * @author hugangquan
 * @date 2021/4/25 12:56
 */
public class TestAllocation {

    public static final int _1MB = 1024*1024;


    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;

        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];

        System.out.println("开始触发minor GC 1");

        allocation3 = new byte[2*_1MB];

        System.out.println("开始触发minor GC 2");

        //这里，由于eden装不下，触发minor GC，6MB数据通过分配担保进入老年代
        allocation4 = new byte[4*_1MB];
    }

}

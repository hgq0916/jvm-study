package com.thizgroup.jvm.book.chapter2;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 * -XX:+PrintCommandLineFlags -XX:+UseSerialGC
 * 大对象分配
 * @author hugangquan
 * @date 2021/4/25 13:17
 */
public class BigObjectAllocationTest {

    public static final int _1MB = 1024*1024;


    public static void main(String[] args) {
        byte[] allocation = new byte[4*_1MB];
    }

}

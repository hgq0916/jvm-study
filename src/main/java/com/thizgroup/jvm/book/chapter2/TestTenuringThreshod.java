package com.thizgroup.jvm.book.chapter2;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
 * 测试老年代晋升，长期存活的对象进入老年代
 * @author hugangquan
 * @date 2021/4/25 13:34
 */
public class TestTenuringThreshod {

    public static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3;

        allocation1 = new byte[_1MB/4];

        allocation2 = new byte[_1MB*4];
        allocation3 = new byte[_1MB*4];

        allocation3 = null;

        allocation3 = new byte[_1MB*4];

    }
}

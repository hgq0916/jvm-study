package com.thizgroup.jvm.book.chapter2;

/**
 * 测试GC回收循环引用
 * @author hugangquan
 * @date 2021/4/14 12:53
 */
public class RefrenceCountGC {

    private Object obj = null;

    private static final int _1MB = 1024*1024;

    private byte[] byteSize = new byte[2*_1MB];

    public static void main(String[] args) {
        RefrenceCountGC r1 = new RefrenceCountGC();
        RefrenceCountGC r2 = new RefrenceCountGC();
        r1.obj = r2;
        r2.obj = r1;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r1 = null;
        r2 = null;

        System.out.println("--------------------");

        System.gc();
    }

}

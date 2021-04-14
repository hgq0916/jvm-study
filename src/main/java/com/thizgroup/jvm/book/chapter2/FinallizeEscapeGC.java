package com.thizgroup.jvm.book.chapter2;

/**
 * finallize使对象复活
 * @author hugangquan
 * @date 2021/4/14 13:07
 */
public class FinallizeEscapeGC {

    public static FinallizeEscapeGC hook = null;


    public void isAlive(){
        System.out.println("obj is is alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize方法被执行...");
        hook = this;
    }

    public static void main(String[] args) {
        FinallizeEscapeGC.hook = new FinallizeEscapeGC();

        hook = null;
        //请求GC
        System.gc();

        //等待finalize执行
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(hook == null){
            System.out.println("hook dead");
        }else {
            hook.isAlive();
        }

        hook = null;
        //请求GC
        System.gc();

        //等待finalize执行
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(hook == null){
            System.out.println("hook dead");
        }else {
            hook.isAlive();
        }

    }

}

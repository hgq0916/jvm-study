package com.thizgroup.jvm.thread;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.jvm.thread.SynchronizedTest
 * @Description: TODO
 * @date 2020/5/28 9:49
 */
public class SynchronizedTest {

  public static synchronized void m(){

  }

  public static  void n(){

  }

  public static void main(String[] args) {
    for(int i=0;i<10000;i++){
      m();
      n();
    }
    Object o = new Object();
    synchronized (o){

    }
  }

}

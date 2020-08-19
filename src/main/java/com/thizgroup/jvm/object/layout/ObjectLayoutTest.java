package com.thizgroup.jvm.object.layout;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.jvm.object.layout.ObjectLayoutTest
 * @Description: TODO
 * @date 2020/5/27 10:06
 */
public class ObjectLayoutTest {

  public static void main(String[] args) {
    Object obj = new Object();

    //打印对象的内存结构
    System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    System.out.println("=======================");
    synchronized (obj){
      System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
  }

}

package com.thizgroup.jvm.string;

import java.util.Random;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.jvm.string.InternTest2
 * @Description: TODO
 * @date 2020/5/27 10:29
 */
public class InternTest2 {

  static final int MAX = 1000 * 10000;
  static final String[] arr = new String[MAX];

  public static void main(String[] args) throws Exception {
    Integer[] DB_DATA = new Integer[10];
    Random random = new Random(10 * 10000);
    for (int i = 0; i < DB_DATA.length; i++) {
      DB_DATA[i] = random.nextInt();
    }
    long t = System.currentTimeMillis();
    for (int i = 0; i < MAX; i++) {
      //arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length]));
      arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();
    }

    System.out.println((System.currentTimeMillis() - t) + "ms");
    System.gc();
  }

}

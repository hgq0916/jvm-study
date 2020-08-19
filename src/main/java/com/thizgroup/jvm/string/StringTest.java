package com.thizgroup.jvm.string;

import org.junit.Test;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.jvm.string.StringTest
 * @Description: TODO
 * @date 2020/5/27 9:58
 */

public class StringTest {

  @Test
  public void internTest(){
    String s = new String("1");
    s.intern();//将字符串放入常量池
    String s1 = "1";

    System.out.println(s==s1);

    String s2 = new String("1")+new String("1");
    s2.intern();//直接将s2的引用放入常量池
    String s3 = "11";
    System.out.println(s2 == s3);

  }

}

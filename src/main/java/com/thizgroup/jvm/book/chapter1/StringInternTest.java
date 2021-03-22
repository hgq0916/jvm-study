package com.thizgroup.jvm.book.chapter1;

/**
 * @author hugangquan
 * @date 2021/3/22 13:31
 */
public class StringInternTest {

    public static void main(String[] args) {
        String s1 = new StringBuilder().append("计算机").append("软件").toString();
        String s2 = new StringBuilder().append("ja").append("va").toString();

        System.out.println(s1.intern() == s1);
        System.out.println(s2.intern() == s2);
    }
}

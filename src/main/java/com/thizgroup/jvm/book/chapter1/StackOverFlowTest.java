package com.thizgroup.jvm.book.chapter1;

/**
 * @author hugangquan
 * @date 2021/3/17 13:39
 */
public class StackOverFlowTest {

    public static int count = 0;

    public static void main(String[] args) {
        try{
            m();
        }catch (Error e){
            e.printStackTrace();
        }

        System.out.println(count);
    }

    public static void m(){
        count++;
        m();
    }

}

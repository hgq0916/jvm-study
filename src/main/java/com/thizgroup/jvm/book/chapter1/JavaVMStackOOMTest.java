package com.thizgroup.jvm.book.chapter1;

/**
 * @author hugangquan
 * @date 2021/3/22 13:21
 */
public class JavaVMStackOOMTest {

    public static void main(String[] args) {
        while (true){
            Thread t = new Thread(()->{
                dontStop();
            });
            t.start();
        }
    }

    public static void dontStop(){
        while (true){}
    }

}

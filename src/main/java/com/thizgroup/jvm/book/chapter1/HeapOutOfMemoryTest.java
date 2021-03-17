package com.thizgroup.jvm.book.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20M -Xmx20M -XX:+PrintGC
 * @author hugangquan
 * @date 2021/3/17 13:39
 */
public class HeapOutOfMemoryTest {


    public static void main(String[] args) {

        List<HeapOutOfMemoryTest> list = new ArrayList<HeapOutOfMemoryTest>();

        for(;;){
            list.add(new HeapOutOfMemoryTest());
        }


    }

}

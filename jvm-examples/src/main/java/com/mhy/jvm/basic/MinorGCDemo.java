package com.mhy.jvm.basic;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn5M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author mahaiyuan
 * @ClassName: MinorGCDemo
 * @date 2018-06-22 下午7:53
 */
public class MinorGCDemo {
    private static final int SIZE = 1024 * 1024;
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("=========生成第" + i + "个数组");
            byte[] bytes = new byte[SIZE];
        }

    }
}

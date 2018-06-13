package com.mhy.jvm.basic;

/**
 * 线程请求栈深度大于虚拟机所允许的最大深度时,会抛出StackOverflowError异常
 * -Xss256K
 * @author mahaiyuan
 * @ClassName: StackOverflowErrorDemo
 * @date 2018-06-13 下午8:43
 */
public class StackOverflowErrorDemo {

  private static int stackLength = 1;

  public static void main(String[] args) {
    stackLeak();
  }

  public static void stackLeak() {
    stackLength++;
    System.out.println("stackLength=" + stackLength);
    stackLeak();  //递归调用
  }
}
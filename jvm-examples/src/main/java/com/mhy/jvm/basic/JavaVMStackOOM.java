package com.mhy.jvm.basic;

/**
 * -Xmx2M
 * 如果虚拟机在扩展栈时无法申请到足够的内存空间,则抛出OutOfMemoryError
 * @author mahaiyuan
 * @ClassName: JavaVMStackOOM
 * @date 2018-06-15 下午5:58
 */
public class JavaVMStackOOM {
  public static void main(String[] args) {
    while (true) {
      new Thread(){
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + " start ......");
          try {
            Thread.sleep(600000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }.start();
    }
  }
}

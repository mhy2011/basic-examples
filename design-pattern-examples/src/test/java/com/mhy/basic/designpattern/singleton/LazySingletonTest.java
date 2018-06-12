package com.mhy.basic.designpattern.singleton;

import org.junit.Test;


import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: LazySingletonTest
 * @date 2018-06-11 下午11:54
 */
public class LazySingletonTest {

  @Test
  public void testGetInstance() throws Exception {
    for (int i = 0; i < 10; i++) {
      new Thread(){
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + " , " + LazySingleton.getInstance());
        }
      }.start();
    }
  }

  @Test
  public void testGetInstanceV2() throws Exception {
    for (int i = 0; i < 10; i++) {
      new Thread(){
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + " , " + LazySingletonV2.getInstance());
        }
      }.start();
    }
  }

  @Test
  public void testGetInstanceV3() throws Exception {

    CountDownLatch countDownLatch = new CountDownLatch(1);

    for (int i = 0; i < 10; i++) {
      new Thread(){
        @Override
        public void run() {
          try {
            countDownLatch.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + " , " + LazySingletonV3.getInstance());
        }
      }.start();
    }
    countDownLatch.countDown();
  }
}
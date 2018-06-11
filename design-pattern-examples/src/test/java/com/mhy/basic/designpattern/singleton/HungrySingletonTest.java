package com.mhy.basic.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: HungrySingletonTest
 * @date 2018-06-11 下午9:02
 */
public class HungrySingletonTest {

  @Test
  public void testGetInstance() throws Exception {
    HungrySingleton instance = HungrySingleton.getInstance();
    HungrySingleton instance2 = HungrySingleton.getInstance();

    System.out.println("instance=" + instance);
    System.out.println("instance2=" + instance2);

    assertEquals(instance, instance2);

  }
}
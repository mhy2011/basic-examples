package com.mhy.basic.designpattern.singleton;

/**
 * @author mahaiyuan
 * @ClassName: LazySingleton
 * @date 2018-06-11 下午11:51
 */
public class LazySingletonV3 {

  private volatile static LazySingletonV3 instance = null;
  private LazySingletonV3() {
  }

  public static LazySingletonV3 getInstance() {
    if (null == instance) {
      synchronized (LazySingletonV3.class) {
        if (null == instance) {
          instance = new LazySingletonV3();
        }
      }
    }
    return instance;
  }
}

package com.mhy.basic.designpattern.singleton;

/**
 * @author mahaiyuan
 * @ClassName: LazySingleton
 * @date 2018-06-11 下午11:51
 */
public class LazySingletonV2 {

  private static LazySingletonV2 instance = null;
  private LazySingletonV2() {
  }

  /**
   * 优点: 线程安全
   * 缺点: synchronized 之后会造成线程阻塞，影响性能
   * @return
   */
  public static synchronized LazySingletonV2 getInstance() {
    if (null == instance) {
      instance = new LazySingletonV2();
    }
    return instance;
  }
}

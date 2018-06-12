package com.mhy.basic.designpattern.singleton;

/**
 * @author mahaiyuan
 * @ClassName: LazySingleton
 * @date 2018-06-11 下午11:51
 */
public class LazySingleton {

  private static LazySingleton instance = null;
  private LazySingleton() {
  }

  /**
   * 优点:按需加载，节省空间
   * 缺点:线程不安全
   * @return
   */
  public static LazySingleton getInstance() {
    if (null == instance) {
      instance = new LazySingleton();
    }
    return instance;
  }
}

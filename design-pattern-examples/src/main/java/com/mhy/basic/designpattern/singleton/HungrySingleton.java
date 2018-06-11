package com.mhy.basic.designpattern.singleton;

/**
 * 饿汉式单例模式
 * 优点:线程安全
 * 缺点:类加载的时候就已经实例化该对象,如果用不到该实例对象的话，就会造成空间浪费
 * @author mahaiyuan
 * @ClassName: HungrySingleton
 * @date 2018-06-11 下午8:25
 */
public class HungrySingleton {

  private static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {
  }

  /**
   * 获取实例
   * @return
   */
  public static HungrySingleton getInstance() {
    return instance;
  }

}

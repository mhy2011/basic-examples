package com.mhy.jvm.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * @author mahaiyuan
 * @ClassName: HeapOOM
 * @date 2018-06-13 下午8:25
 */
public class HeapOOM {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();

    while (true) {
      list.add(new Student());
    }
  }

  static class Student {

  }

}

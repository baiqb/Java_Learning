/*
 * @Author: baiqb_whu@boywe.cn
 * @Date: 2022-04-09 05:03:34
 * @FilePath: /Java_Learning/JAVA_BASE/src/base/ArrayTypes.java
 * @LastEditors: baiqb_whu@boywe.cn
 * @LastEditTime: 2022-04-09 05:53:31
 */
package src.base;

import java.util.ArrayList;

public class ArrayTypes {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    test(arr1);
    System.out.println(arr1[2]);
  }

  public static void test(int[] v) {
    v[2] = 20;
  }
}

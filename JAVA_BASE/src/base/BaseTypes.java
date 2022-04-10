/*
 * @Author: baiqb_whu@boywe.cn
 * @Date: 2022-04-09 02:52:11
 * @FilePath: /Java_Learning/JAVA_BASE/src/base/types/BaseTypes.java
 * @LastEditors: baiqb_whu@boywe.cn
 * @LastEditTime: 2022-04-09 04:54:48
 */
package src.base;

public class BaseTypes {
  public static void main(String[] args) {
    BaseTypes baseTypes = new BaseTypes();
    // baseTypes.baseTypes();
    // baseTypes.stringConnect();
    baseTypes.rightShiftOperator();
  }

  // 右移运算符
  public void rightShiftOperator() {
    int testInt = -128;
    System.out.println("有符号右移：" + (testInt >> 10));
    System.out.println(Integer.toBinaryString(testInt >> 10));
    System.out.println("无符号右移,用0补齐:" + (testInt >>> 10));
    System.out.println(Integer.toBinaryString(testInt >>> 10));
  }

  // 字符串的拼接
  public void stringConnect() {
    String name = "Jack";
    int age = 18;
    float height = 1.78F;
    System.out.println(name + " age is :" + age + ", height is :" + height);
  }

  // 基础变量类型
  public void baseTypes() {
    byte valByte = 123; // 8-bit
    short valShort = 1225; // 16-bit
    int valInt = 65; // 32-bit
    long valLong = 123L; // 64-bit
    float valFloat = 12.3F; // 32位单精度
    double valDouble = 123.4; // 64位双精度
    char valChar = 'a'; // 单引号表示字符
    String valString = "ABCD"; // 双引号表示字符串
    boolean varBool = true; // 布尔值
    String valNull = null; // 表示valNul不指向任务值
    System.out.println(valByte);
    System.out.println(valShort);
    System.out.println(valInt);
    System.out.println(valLong);
    System.out.println(valFloat);
    System.out.println(valDouble);
    System.out.println(valChar);
    System.out.println(valString);
    System.out.println(varBool);
    System.out.println(valNull);
  }
}

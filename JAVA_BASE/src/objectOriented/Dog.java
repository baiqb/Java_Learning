/*
 * @Author: baiqb_whu@boywe.cn
 * @Date: 2022-04-09 06:18:34
 * @FilePath: /Java_Learning/JAVA_BASE/src/objectOriented/Dog.java
 * @LastEditors: baiqb_whu@boywe.cn
 * @LastEditTime: 2022-04-09 06:20:41
 */
package src.objectOriented;

public class Dog {
  public int age;
  public double weight;

  public void run() {
    System.out.println(age + "_" + weight + "_walk");
  }

  public void eat(String food) {
    System.out.println(age + "_" + weight + "_eat_" + food);
  }

  public static void main(String[] args) {
    new Dog().run();
    new Dog().eat("food");
  }
}

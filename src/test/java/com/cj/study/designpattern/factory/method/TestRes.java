package com.cj.study.designpattern.factory.method;

import org.junit.Test;

public class TestRes {

  @Test
  public void demo1(){
      AppleFactory appleFactory = new AppleFactory();
      Fruit apple = appleFactory.create();
      apple.eat();

      OrangeFactory orangeFactory = new OrangeFactory();
      Fruit orange = orangeFactory.create();
      orange.eat();

  }
}

package com.j1.w10.adapter;

public class DuckTestDrive {
  public static void main(String[] args) {
    WildTurkey turkey=new WildTurkey();
    TurkeyAdapter ta=new TurkeyAdapter(turkey);
    ta.quack();
  }
  static void testDuck(Dcuk duck){
  duck.quack();
  duck.fly();
  }
}
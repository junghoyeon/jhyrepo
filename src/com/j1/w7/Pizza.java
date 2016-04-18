package com.j1.w7;

public abstract class Pizza {
  String name;
  void prepare() {
    System.out.println("preparing"+name);
  }
  void bake() {
    System.out.println("Bakeing...")
  }
  void cut() {
    System.out.println("Cutting...")
  }
  void box() {
    System.out.println("Boxing...")
  }
  public String getName() {
    return name;
  }
}
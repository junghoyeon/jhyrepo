package com.j1.w6;
/*
public class PizzaStore {
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza=factory.createPizza(type);
    pizza.prepare();
  }
}*/
abstract class PizzaStore {
  abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type) {
    Pizza pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new NYStyleVeggiePizza();
    } else return null;
  }
}


public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore=new NYPizzaStore();
    Pizza pizza-nyStore.orderPizza("cheese");
    pizza.getName();
   }
}
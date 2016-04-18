package com.j1.w7;

public class ChicagoPizzaStore extends PizzaSotre {
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    
    if (item.equals("cheese")) {
      pizza=new CheesePizza(ingredientFactory);
      pizza.setName("Chicago style cheese pizza");
        }
      return pizza;
   }
}
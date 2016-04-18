class PizzaIngredientFactory
class PizzaIngredientFactory <|-- ChicagoPizza\nIngredientFac
class PizzaIngredientFactory <|-- NYPizza\nIngredientFac

interface Cheese
interface Dough

Cheese <|..MozzarellaCheese
Cheese <|..ReggianoCheese
Dough <|..ThickCrustDough
Dough <|..ThinCrustDough

ChicagoPizza\nIngredientFac ..> Dough
ChicagoPizza\nIngredientFac ..> Cheese
NYPizza\nIngredientFac ..> Dough
NYPizza\nIngredientFac ..> Cheese

abstract class Pizza {
  dough:Dough
  cheese:Cheese
  abstract void prepare()
  void bake()
}

class CheesePizza {
  fac:PizzaIngredientFactory
  CheesePizza(PizzaIngredientFactory)
}
Pizza <|-- CheesePizza

abstract class PizzaStore {
  #abstract Pizza createPizza(String item)
  +Pizza orderPizza(String type)
}
PizzaStore <|-- ChicagoPizzaStore
ChicagoPizzaStore --> PizzaIngredientFactory
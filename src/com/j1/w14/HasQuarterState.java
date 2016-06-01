package com.j1.w14;

public class HasQuarterState implements State{
  GumballMachine gumballMachine;
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
    
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("Yout turned..");
  }
}
package com.j1.w15;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine{
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;

  soldOutState;
  int cound = 0;
  String location;
  
  public GumballMachine(String location, int count)throws RemoteException{
    new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState-new SoldState(this);
    
    this.count=count;
    if(count>0){
      state=noQuarterState;
    }
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
   state.ejectQuarter();
  }
  public void turnCrank(){
   state.turnCrank();
  }
  public void setState(State state){
    this.state=state;
  }
  public State getNoQuarterState(){
    return noQuarterState;
  }
  public State getSoldState(){
    return soldState;
  }
}
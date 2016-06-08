package com.j1.w15;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachineRemote gumballMachine=null;
    int count;
    if (args.length<2){
      System.out.println("error");
      System.exit(1);;
    }
    try{
      count=Integer.parsetInt(args[1]);
      gumballMachine=new GumballMachine(args[0], count);
    Naming.rebind("rmi://"+args[0]+"/gumballmachine",gumballMachine);
    
  }
}
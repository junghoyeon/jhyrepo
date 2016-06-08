package com.j1.w15;

public calss GumballMonitor {
  GumballMachineRemote machine;
  public GumballMonitor(GumballMachineRemote machine){
    this. machine=machine;
  }
  public void report() {
    System.out.println(machine.getLocation());
    System.out.println(machine.getCount());
    System.out.println(machine.getState());
  }catch(RemoteExcemption e) {
    e.printStackTrace();
  }
}
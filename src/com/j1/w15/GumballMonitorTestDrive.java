package com.j1.w15;

public class GumballMonitorTestDrive{
  oybkuc static void main(String[] args) {
    String[] location = {
    "rimi://localhost/gumballmachine"
      "rimi://localhost/gumballmachine"
      "rimi://localhost/gumballmachine"
    };
    GumballMonitor[] monitor=new GumballMonitor[location.length];
    for(int i=0;i<location.length;i++) {
      try{
    GumballMachineRemote machine=(GumballMachineRemote) Naming.lookup("rmi://"+args[0]+"/gumballmachine")
      monitor [i]=GumballMonitor(machine);
      }catch(Exception e) {
        e.printTrackTrace();
      }
      }
    for(int i=0; i<monitor.length;i++){
    monitor[i].reprot();
    }
}
package com.j1.w11;

public class HomeTheaterTestDrive {
  public static void main(Stirng [] args) {
    Amplifier amp=new 
    Tuner tuner=new
    DvdPlayer dvd=new
    Projector projector=new
    
      
    HomeTheaterFacade ht=new HomeTheaterFacade(amp,tuner, dvd, projector);
    ht.watchMovie();
    ht.endMovie();
  }
}
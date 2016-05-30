package com.j1.w13;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items; 
  int position=0;
  public DinerMenuIterator(MenuItem[]){
    
  }
  public Object next() {
    Menu menuitem=items[positon];
    postion = positon + 1;
    return menuItem;
  }
  public boolean hasNext(){
    if(positon >=items.length || items[positon]==null) {
      return false;
     }
    else {
      return true;
    }
  }
}

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  public Waitress(PanckeHouseMenu p, DinerMenu d) {
    this.phm=p;
    this.dm=d;
  }
  public printMenu(){
  Iterator pi=phm.createIterator();
  printMenu(pi);
  Iterator dm=dm.createLterator();
  printMenu(dm);
  }
  public viod printMenu(Iterator iterator){
    While(pi.hasNext()) {
      menuItem menuItme=(MenuItem)pi.next();
      system.out.println(menuItem.getName());
    }
    publci static void main(String[] args){
      printMenu();
    }
      
    }
  }
  
  
}
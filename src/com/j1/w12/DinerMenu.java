package com.j1.w12;
import java.util.ArrayList;
public class DinerMenu{
  //static final int MAX_ITEMS=3;
  //MenueItem[] menuItems;
  public DinerMenu() {
    menuItems=new ArrayList();
    addItem("BLT", "explain", ture, 2.9);
    addItem("CLT", "explain", ture, 3.9);
    addItem("DLT", "explain", ture, 4.9);
  }
    
    public void addItem(String name, String description, boolean v, double p){
      MenuItem menuItem=new MenuItem(name, description, v, p);
      /*if(numberOfItemss>=MAX_ITEMS) {
        System.err.println("Error");
      }
      else{
      menuItems[0]=menuItem;
      numberOfItmes=nuberOfItems+1;
  }*/
      menuItems.add(menuItem);
 }
}
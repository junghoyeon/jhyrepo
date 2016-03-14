/*
 * @author jhy
 * @since 20160314
 * to demo upcasting and downcast
 */

package com.sd.turtle;
import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtle extends Turtle {
  private int weight;
  public WeightTurtle(int w) {
    weight=w;
    setPenColor(Color.red);
  }
  public int getWeight() {
    return weight;
  -weight:int
  +getWeight():int
}
package com.j1.w10.undo;

public class LightOffCommand implements Command {
 Light light;
 int level;
 public LightOffCommand(Light light) {
  this.light = light;
 }
 
 public void execute() {
        level = light.getLevel();
  light.off();
 }
 
 public void undo() {
  light.dim(level);
 }
}
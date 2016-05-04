package com.j1.w10.undo;

public interface Command {
    public void execute();
    public void undo();
}
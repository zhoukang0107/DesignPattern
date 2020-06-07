package com.pattern.design.cmd;

public class GarageDoorOpenCommand implements Command {
    @Override
    public void execute() {
        System.out.println("garage door open!");
    }
}

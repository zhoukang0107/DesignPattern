package com.pattern.design.cmd;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        control.setCommand(command);
        control.buttonWasPressed();

        GarageDoorOpenCommand command1 = new GarageDoorOpenCommand();
        control.setCommand(command1);
        control.buttonWasPressed();
    }
}

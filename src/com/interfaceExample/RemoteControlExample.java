package com.interfaceExample;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl a = new Television();
        a.turnOn();
        a.turnOff();
        a.setMute(true);
        RemoteControl.changeBattery();
        RemoteControl b = new Audio();


        b.turnOn();
        b.turnOff();
        RemoteControl.changeBattery();
        b.setMute(true);



    }
}

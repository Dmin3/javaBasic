package com.interfaceExample;

public class MyClass {

    RemoteControl rc;

    public MyClass(Television tv){
        this.rc = tv;
    }


    public static void main(String[] args) {
        Television tv1 = new Television();
        MyClass a = new MyClass(tv1);
        a.rc.turnOff();
        a.rc.turnOn();

    }
}

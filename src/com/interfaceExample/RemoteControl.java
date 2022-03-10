package com.interfaceExample;

public interface RemoteControl {

    //컴파일러 할 시 public static final을 자동으로 붙어준다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드 - > 컴파일러 할 시 public을 자동으로 붙어준다.
    void turnOff();
    void turnOn();
    void setVolume(int volume);

    //디폴트 메소드
    default void setMute(boolean mute) {
        if (mute){
            System.out.println("무음으로 처리합니다.");
        } else {
            System.out.println("음소거를 해제 합니다.");
        }
    }

    //정적 메소드 - > 컴파일러 할 시 public을 자동으로 붙어준다.
     static void changeBattery() {
         System.out.println("건전지를 교체합니다.");
    }




}

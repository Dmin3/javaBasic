package com.interfaceExample;

public class Television implements RemoteControl {

    //필드
    private int volume;


    @Override
    public void turnOff() {
        System.out.println("TV을 끕니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("TV을 킵니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV볼륨 :" + this.volume);
    }
}

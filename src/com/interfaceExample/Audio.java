package com.interfaceExample;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("오디오를 킵니다.");
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
        System.out.println("현재 오디오볼륨 :" + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        if (mute){
            System.out.println("오디오를 무음처리합니다.");
        } else {
            System.out.println("오디오 무음처리를 끕니다.");
        }
    }
}

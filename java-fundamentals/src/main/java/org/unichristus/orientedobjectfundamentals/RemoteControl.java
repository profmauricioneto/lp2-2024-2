package org.unichristus.orientedobjectfundamentals;

public class RemoteControl {
    public int channel;
    public int volume;

    public RemoteControl(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }
    public void increaseChannel() {
        this.channel++;
    }
    public void decreaseChannel() {
        this.channel--;
    }
    public void increaseVolume() {
        this.volume++;
    }
    public void decreaseVolume() {
        this.volume++;
    }
    public void changeChannel(int newChannel) {
        this.channel = newChannel;
    }
    public void status() {
        System.out.println("Channel: " + this.channel);
        System.out.println("Volume: " + this.volume);
    }
}

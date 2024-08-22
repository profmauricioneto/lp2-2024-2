package org.unichristus.orientedobjectfundamentals;

public class Television {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(5,45);
        remote.status();

        for(int i = 0; i < 5; i++) {
            remote.increaseVolume();
        }

        remote.status();
        remote.changeChannel(45);
        remote.status();
    }
}

package org.unichristus.abstractclass.observerexample;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers;
    public Subject() {
        observers = new ArrayList<>();
    }

    public boolean isEven(int value) {
        boolean flag = false;
        if (value % 2 == 0) {
            flag = true;
        }
        return flag;
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllAttaches() {
        for (Observer ob: observers) {
            ob.update();
        }
    }
}

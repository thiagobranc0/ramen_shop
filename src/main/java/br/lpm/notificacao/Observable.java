package br.lpm.notificacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public Observable() {
        this.setState(Pedido.PENDENTE);
    }

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.updateAll();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void updateAll() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

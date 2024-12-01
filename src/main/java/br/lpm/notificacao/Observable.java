package br.lpm.notificacao;

public abstract class Observable {
    private Observer observer;

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if(this.state != state){
            this.state = state;
            this.updateObserver();
        }
    }

    public void setObserver(Observer observer) {
        if (observer != null) {
            this.observer = observer;
        }
    }

    public Observer getObserver() {
        return observer;
    }

    public void updateObserver() {
        if (observer != null) {
            observer.update();
        }
    }

}

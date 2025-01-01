package br.lpm.notificacao;

public abstract class Observable {
    private Observer observer;

    private Estado state;

    public Observable() {
    }

    public Estado getState() {
        return state;
    }

    public String setState(Estado state) {
        if(this.state != state){
            this.state = state;
            return this.updateObserver();
        }
        return null;
    }

    public void setObserver(Observer observer) {
        if (observer != null) {
            this.observer = observer;
        }
    }

    public Observer getObserver() {
        return observer;
    }

    public String updateObserver() {
        if (observer != null) {
            return observer.update();
        }
        return null;
    }
}

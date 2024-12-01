package br.lpm.notificacao;

public abstract class Observer {
    private Observable observable;

    public Observer(Observable observable) {
        this.setObservable(observable);
        this.observable.setObserver(this);
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        if(observable != null) {
            this.observable = observable;
        }
    }



    public abstract void update();
}

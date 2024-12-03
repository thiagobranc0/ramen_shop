package br.lpm.notificacao;

import br.lpm.ramens.Ramen;

public class Pedido extends Observable {
    public static final int PENDENTE = 0;
    public static final int PRONTO = 1;
    public static final int RETIRADO = 2;

    private Ramen ramen;
    private int id;

    public Pedido(Ramen ramen) {
        this.setState(PENDENTE);
        this.setRamen(ramen);
    }

    public Ramen getRamen() {
        return ramen;
    }

    public void setRamen(Ramen ramen) {
        if (ramen != null) {
            this.ramen = ramen;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        }
    }
}

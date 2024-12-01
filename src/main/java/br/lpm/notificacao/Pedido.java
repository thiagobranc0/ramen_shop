package br.lpm.notificacao;

import br.lpm.ramens.Ramen;

public class Pedido extends Observable {
    public static final int PENDENTE = 0;
    public static final int PRONTO = 1;
    public static final int RETIRADO = 2;

    private Ramen ramen;
    private int count = 0;
    private Long id;

    public Pedido(Ramen ramen) {
        this.setState(PENDENTE);
        this.setRamen(ramen);
    }

    public Ramen getRamen() {
        return ramen;
    }

    public void setRamen(Ramen ramen) {
        this.ramen = ramen;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package br.lpm.notificacao;

import br.lpm.ramens.Ramen;

public class Pedido extends Observable {

    private Ramen ramen;
    private int id;

    public Pedido(Ramen ramen) {
        super();
        this.setState(Estado.PREPARANDO);
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

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", ramen=" + ramen.getDescricao() +
                ", preco=" + ramen.getPreco() +
                ", estado=" + super.updateObserver() +
                '}';
    }
}

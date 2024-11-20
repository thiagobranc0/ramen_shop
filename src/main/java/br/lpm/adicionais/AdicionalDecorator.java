package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public abstract class AdicionalDecorator implements Ramen {
    private final Ramen ramen;

    public AdicionalDecorator(Ramen ramen) {
        this.ramen = ramen;
    }

    @Override
    public String getDescricao() {
        return ramen.getDescricao();
    }

    @Override
    public double getPreco() {
        return ramen.getPreco();
    }
}

package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class Chilli extends AdicionalDecorator{

    public Chilli(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Chilli (2,50)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.50;
    }
}

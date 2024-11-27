package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class Tofu extends AdicionalDecorator{

    public Tofu(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Tofu (2,70)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.70;
    }
}

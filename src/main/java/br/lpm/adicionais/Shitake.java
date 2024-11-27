package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class Shitake extends AdicionalDecorator{

    public Shitake(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Shitake (6,90)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 6.90;
    }
}

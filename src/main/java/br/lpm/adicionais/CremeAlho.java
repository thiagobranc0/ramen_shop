package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class CremeAlho extends AdicionalDecorator{

    public CremeAlho(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Creme de alho (1,50)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.50;
    }
}

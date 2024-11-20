package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class Croutons extends AdicionalDecorator {

    public Croutons(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Croutons (2,00)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2;
    }
}

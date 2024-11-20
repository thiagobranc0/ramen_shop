package br.lpm.bebidas;

import br.lpm.adicionais.AdicionalDecorator;
import br.lpm.ramens.Ramen;

public class Refrigerante extends AdicionalDecorator {

    public Refrigerante(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Refrigerante (5,90)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 5.90;
    }
}

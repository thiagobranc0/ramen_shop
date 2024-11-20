package br.lpm.bebidas;

import br.lpm.adicionais.AdicionalDecorator;
import br.lpm.ramens.Ramen;

public class OCha extends AdicionalDecorator {

    public OCha(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "O-Cha (3,90)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3.90;
    }
}

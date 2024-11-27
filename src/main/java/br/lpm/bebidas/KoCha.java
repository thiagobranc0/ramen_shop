package br.lpm.bebidas;

import br.lpm.adicionais.AdicionalDecorator;
import br.lpm.ramens.Ramen;

public class KoCha extends AdicionalDecorator {

    public KoCha(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Ko-Cha (Gratuito)";
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}

package br.lpm.adicionais;

import br.lpm.ramens.Ramen;

public class ProteinaExtra extends AdicionalDecorator {

    public ProteinaExtra(Ramen ramen) {
        super(ramen);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Proteína extra (4,00)";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 4;
    }
}

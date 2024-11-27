package br.lpm.ramens;

import br.lpm.proteinas.Proteina;

public class RamenGrande extends RamenGenerico implements Ramen {

    public RamenGrande(Proteina proteina) {
        super(proteina);
    }

    @Override
    public String getDescricao() {
        return "Ramen Grande (15,90) proteína: " + super.getProteinaDescricao();
    }

    @Override
    public double getPreco() {
        return 15.90 + super.getProteincaPreco();
    }
}

package br.lpm.ramens;

import br.lpm.proteinas.Proteina;

public class RamenPequeno extends RamenGenerico implements Ramen{

    public RamenPequeno(Proteina proteina) {
        super(proteina);
    }

    @Override
    public String getDescricao() {
        return "Ramen pequeno (9,90) proteína: " + super.getProteinaDescricao();
    }

    @Override
    public double getPreco() {
        return 9.90 + super.getProteincaPreco();
    }
}

package br.lpm.ramens;

import br.lpm.proteinas.Proteina;

public class RamenMedio extends RamenGenerico implements Ramen {

    public RamenMedio(Proteina proteina) {
        super(proteina);
    }

    @Override
    public String getDescricao() {
        return "Ramen medio (12,90) proteína: " + super.getProteinaDescricao();
    }

    @Override
    public double getPreco() {
        return 12.90 + super.getProteincaPreco();
    }
}

package br.lpm.ramens;

import br.lpm.proteinas.Proteina;

public abstract class RamenGenerico {
    private Proteina proteina;

    public RamenGenerico(Proteina proteina) {
        this.proteina = proteina;
    }

    public Proteina getProteina() {
        return proteina;
    }

    public void setProteina(Proteina proteina) {
        this.proteina = proteina;
    }

    public double getProteincaPreco() {
        return proteina.getPreco();
    }

    public String getProteinaDescricao() {
        return proteina.getDescricao();
    }
}

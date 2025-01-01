package br.lpm.proteinas;

public class Porco implements Proteina {
    public Porco() {
    }

    @Override
    public String getDescricao() {
        return "Porco (5,90)";
    }

    @Override
    public double getPreco() {
        return 5.90;
    }
}

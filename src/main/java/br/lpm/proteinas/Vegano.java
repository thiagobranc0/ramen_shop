package br.lpm.proteinas;

public class Vegano implements Proteina {
    public Vegano() {
    }

    @Override
    public String getDescricao() {
        return "Vegano (3,90)";
    }

    @Override
    public double getPreco() {
        return 3.90;
    }
}

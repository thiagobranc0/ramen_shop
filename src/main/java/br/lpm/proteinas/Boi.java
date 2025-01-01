package br.lpm.proteinas;

public class Boi implements Proteina {
    public Boi() {
    }

    @Override
    public String getDescricao() {
        return "Boi (7,90)";
    }

    @Override
    public double getPreco() {
        return 7.90;
    }
}

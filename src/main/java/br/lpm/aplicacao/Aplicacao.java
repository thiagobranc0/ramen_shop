package br.lpm.aplicacao;

import br.lpm.adicionais.Chilli;
import br.lpm.adicionais.CremeAlho;
import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Vegano;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;

public class Aplicacao {
    public static void main(String[] args) {
        Ramen meuRamen = new RamenGrande(new Vegano());
        System.out.println(meuRamen.getDescricao());
        System.out.println("preço: " + meuRamen.getPreco());
        meuRamen = new Chilli(meuRamen);
        meuRamen = new CremeAlho(meuRamen);
        System.out.println(meuRamen.getDescricao());
        System.out.println("preço: " + meuRamen.getPreco());
    }
}

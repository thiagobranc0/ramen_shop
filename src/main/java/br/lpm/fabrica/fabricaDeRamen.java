package br.lpm.fabrica;

import br.lpm.adicionais.*;
import br.lpm.bebidas.KoCha;
import br.lpm.bebidas.OCha;
import br.lpm.bebidas.Refrigerante;
import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Porco;
import br.lpm.proteinas.Proteina;
import br.lpm.proteinas.Vegano;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import br.lpm.ramens.RamenMedio;
import br.lpm.ramens.RamenPequeno;

import java.util.List;

public class fabricaDeRamen {
    public Ramen makeRamen(int tamanho, int proteina, List<Integer> acrescimos) {
        Proteina novaProteina = null;

        switch(proteina) {
            case 1:
                novaProteina = new Boi();
                break;
            case 2:
                novaProteina = new Porco();
                break;
            case 3:
                novaProteina = new Vegano();
                break;
            default:
                break;
        }

        Ramen novoRamen = null;

        switch(tamanho) {
            case 1:
                novoRamen = new RamenPequeno(novaProteina);
                break;
            case 2:
                novoRamen = new RamenMedio(novaProteina);
                break;
            case 3:
                novoRamen = new RamenGrande(novaProteina);
                break;
            default:
                break;
        }

        for (Integer acrescimo : acrescimos) {
            if(acrescimo == 1) {
                novoRamen = new Chilli(novoRamen);
            }
            if(acrescimo == 2) {
                novoRamen = new CremeAlho(novoRamen);
            }
            if(acrescimo == 3) {
                novoRamen = new Croutons(novoRamen);
            }
            if(acrescimo == 4) {
                novoRamen = new ProteinaExtra(novoRamen);
            }
            if(acrescimo == 5) {
                novoRamen = new Shitake(novoRamen);
            }
            if(acrescimo == 6) {
                novoRamen = new Tofu(novoRamen);
            }
            if(acrescimo == 7) {
                novoRamen = new Refrigerante(novoRamen);
            }
            if(acrescimo == 8) {
                novoRamen = new OCha(novoRamen);
            }
            if(acrescimo == 9) {
                novoRamen = new KoCha(novoRamen);
            }
        }

        return novoRamen;
    }
}

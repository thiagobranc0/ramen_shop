package br.lpm.bebidas;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KoChaTest {
    Proteina boi;
    Ramen meuRamen;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenPequeno(boi);
        meuRamen = new KoCha(meuRamen);
    }


    @Test
    void testGetDescricao() {
        String descricaoEsperada = "Ramen pequeno (9,90) proteína: Boi (7,90) + Ko-Cha (Gratuito)";
        String descricaoRecebida = meuRamen.getDescricao();
        assertEquals(descricaoEsperada, descricaoRecebida, "Testando getDescricao de adicional Ko-Cha");
    }

    @Test
    void testGetPreco() {
        double precoEsperado = 17.80;
        double precoRecebido = meuRamen.getPreco();
        assertEquals(precoEsperado, precoRecebido, "Testando getPreco de adicional Ko-Cha");
    }
}
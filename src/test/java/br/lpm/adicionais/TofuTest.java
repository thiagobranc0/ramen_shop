package br.lpm.adicionais;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TofuTest {
    Proteina boi;
    Ramen meuRamen;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenPequeno(boi);
        meuRamen = new Tofu(meuRamen);
    }


    @Test
    void testGetDescricao() {
        String descricaoEsperada = "Ramen pequeno (9,90) proteína: Boi (7,90) + Tofu (2,70)";
        String descricaoRecebida = meuRamen.getDescricao();
        assertEquals(descricaoEsperada, descricaoRecebida, "Testando getDescricao de adicional Tofu");
    }

    @Test
    void testGetPreco() {
        double precoEsperado = 20.5;
        double precoRecebido = meuRamen.getPreco();
        assertEquals(precoEsperado, precoRecebido, "Testando getPreco de adicional Tofu");
    }
}
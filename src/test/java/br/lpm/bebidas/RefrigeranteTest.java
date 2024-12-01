package br.lpm.bebidas;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefrigeranteTest {
    Proteina boi;
    Ramen meuRamen;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenPequeno(boi);
        meuRamen = new Refrigerante(meuRamen);
    }


    @Test
    void testGetDescricao() {
        String descricaoEsperada = "Ramen pequeno (9,90) proteína: Boi (7,90) + Refrigerante (5,90)";
        String descricaoRecebida = meuRamen.getDescricao();
        assertEquals(descricaoEsperada, descricaoRecebida, "Testando getDescricao de adicional Refrigerante");
    }

    @Test
    void testGetPreco() {
        double precoEsperado = 23.700000000000003;
        double precoRecebido = meuRamen.getPreco();
        assertEquals(precoEsperado, precoRecebido, "Testando getPreco de adicional Refrigerante");
    }
}
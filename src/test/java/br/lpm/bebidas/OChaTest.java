package br.lpm.bebidas;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OChaTest {
    Proteina boi;
    Ramen meuRamen;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenPequeno(boi);
        meuRamen = new OCha(meuRamen);
    }


    @Test
    void testGetDescricao() {
        String descricaoEsperada = "Ramen pequeno (9,90) proteína: Boi (7,90) + O-Cha (3,90)";
        String descricaoRecebida = meuRamen.getDescricao();
        assertEquals(descricaoEsperada, descricaoRecebida, "Testando getDescricao de adicional O-Cha");
    }

    @Test
    void testGetPreco() {
        double precoEsperado = 21.7;
        double precoRecebido = meuRamen.getPreco();
        assertEquals(precoEsperado, precoRecebido, "Testando getPreco de adicional O-Cha");
    }
}
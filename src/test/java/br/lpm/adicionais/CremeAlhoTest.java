package br.lpm.adicionais;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CremeAlhoTest {
    Proteina boi;
    Ramen meuRamen;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenPequeno(boi);
        meuRamen = new CremeAlho(meuRamen);
    }


    @Test
    void testGetDescricao() {
        String descricaoEsperada = "Ramen pequeno (9,90) proteína: Boi (7,90) + Creme de alho (1,50)";
        String descricaoRecebida = meuRamen.getDescricao();
        assertEquals(descricaoEsperada, descricaoRecebida, "Testando getDescricao de adicional Creme de alho");
    }

    @Test
    void testGetPreco() {
        double precoEsperado = 19.3;
        double precoRecebido = meuRamen.getPreco();
        assertEquals(precoEsperado, precoRecebido, "Testando getPreco de adicional Creme de alho");
    }
}
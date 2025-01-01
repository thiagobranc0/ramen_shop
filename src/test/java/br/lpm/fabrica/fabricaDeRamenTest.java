package br.lpm.fabrica;

import br.lpm.ramens.Ramen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FabricaDeRamenTest {


    @Test
    void testMakeRamen() {
        FabricaDeRamen fabrica = new FabricaDeRamen();

        int tamanhoMedio = 2;

        List<Integer> acrescimos = new ArrayList<>();

        acrescimos.add(1);
        acrescimos.add(2);
        acrescimos.add(3);
        acrescimos.add(9);

        int ProteinaBoi = 1;

        Ramen meuRamen = fabrica.makeRamen(tamanhoMedio, ProteinaBoi, acrescimos);

        String descricaoRamen = meuRamen.getDescricao();
        double precoRamen = meuRamen.getPreco();

        assertEquals(descricaoRamen, meuRamen.getDescricao(), "Testando fabrica de Ramen");
        assertEquals(precoRamen, meuRamen.getPreco(), "Testando getPreco da fabrica de Ramen");
    }
}
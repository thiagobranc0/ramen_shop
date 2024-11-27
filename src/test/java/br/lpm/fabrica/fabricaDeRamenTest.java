package br.lpm.fabrica;

import br.lpm.ramens.Ramen;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class fabricaDeRamenTest {


    @Test
    void testMakeRamen() {
        fabricaDeRamen fabrica = new fabricaDeRamen();
        int tamanhoMedio = 2;
        List<Integer> acrescimos = new ArrayList<>();
        acrescimos.add(1);
        acrescimos.add(2);
        acrescimos.add(3);
        acrescimos.add(9);
        int ProteinaBoi = 1;

        Ramen meuRamen = fabrica.makeRamen(tamanhoMedio, ProteinaBoi, acrescimos);
        assertEquals("Ramen medio (12,90) proteína: Boi (7,90) + Chilli (2,50) + Creme de alho (1,50) + Croutons (2,00) + Ko-Cha (Gratuito)", meuRamen.getDescricao(), "Testando fabrica de Ramen");
    }
}
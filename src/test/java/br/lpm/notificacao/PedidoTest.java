package br.lpm.notificacao;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.proteinas.Vegano;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    Proteina vegano;
    Ramen meuRamen;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        vegano = new Vegano();
        meuRamen = new RamenGrande(vegano);
        pedido = new Pedido(meuRamen);
    }

    @Test
    void testSetRamen() {
        Proteina boi = new Boi();
        Ramen novoRamen = new RamenPequeno(boi);
        pedido.setRamen(novoRamen);
        assertEquals(novoRamen, pedido.getRamen(), "Testando setRamen");
        pedido.setRamen(null);
        assertEquals(novoRamen, pedido.getRamen(), "Testando settar Ramen para null");
    }

    @Test
    void testSetId() {
        int idPedido = 1;
        pedido.setId(idPedido);
        assertEquals(idPedido, pedido.getId(), "Testando setId");
        int idPedidoErrado = -1;
        pedido.setId(idPedidoErrado);
        assertEquals(idPedido, pedido.getId(), "Testando setId com valor negativo");
    }
}
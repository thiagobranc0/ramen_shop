package br.lpm.notificacao;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObservableTest {
    String nome1;
    String nome2;
    Proteina proteina;
    Ramen meuRamen1;
    Ramen meuRamen2;
    Observable pedido1;
    Observable pedido2;
    Cliente cliente1;
    Cliente cliente2;

    @BeforeEach
    void setUp() {
        nome1 = "Thiago";
        nome2 = "Meruem";
        proteina = new Boi();
        meuRamen1 = new RamenGrande(proteina);
        meuRamen2 = new RamenGrande(proteina);
        pedido1 = new Pedido(meuRamen1);
        pedido2 = new Pedido(meuRamen2);
        cliente1 = new Cliente(nome1, pedido1);
    }




    @Test
    void testSetState() {
        int estadoPedido = Pedido.PRONTO;
        String updateMessage = "Pedido pronto: Thiago";
        assertEquals(updateMessage, pedido1.setState(estadoPedido), "Testando setState do pedido");
        updateMessage = pedido1.setState(estadoPedido);
        assertNull(updateMessage, "Testando setState de mesmo estado para pedido");

    }

    @Test
    void testSetObserver() {
        pedido2.setObserver(cliente2);
        assertEquals(cliente2, pedido2.getObserver(), "Testando setObserver");
    }

    @Test
    void testUpdateObserver() {
         String updateMessage =  pedido1.updateObserver();
        assertEquals(updateMessage, pedido1.updateObserver(), "Testando updateObserver");
    }
}
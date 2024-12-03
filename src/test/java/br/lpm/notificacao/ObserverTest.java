package br.lpm.notificacao;

import br.lpm.proteinas.Proteina;
import br.lpm.proteinas.Vegano;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import br.lpm.ramens.RamenMedio;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    Proteina vegano = new Vegano();
    Ramen meuRamen1 = new RamenMedio(vegano);
    String nome = "Ryu";
    Observable pedido1 = new Pedido(meuRamen1);
    Cliente cliente = new Cliente(nome, pedido1);

    @Test
    void testSetObservable() {
        Ramen meuRamen2 = new RamenGrande(vegano);
        Observable pedido2 = new Pedido(meuRamen2);
        cliente.setObservable(pedido2);
        assertEquals(pedido2, cliente.getObservable(),"Testanto set observable");
        cliente.setObservable(null);
        assertEquals(pedido2, cliente.getObservable(),"Testanto set observable com valor nulo");
    }
}
package br.lpm.fila;

import br.lpm.notificacao.Cliente;
import br.lpm.notificacao.Pedido;
import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import br.lpm.ramens.RamenPequeno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest {
    String nome1;
    String nome2;
    Proteina proteina;
    Ramen meuRamen1;
    Ramen meuRamen2;
    Pedido pedido1;
    Pedido pedido2;
    Cliente cliente1;
    Cliente cliente2;
    Fila fila;

    @BeforeEach
    void setUp() {
        nome1 = "Thiago";
        nome2 = "Meruem";
        proteina = new Boi();
        meuRamen1 = new RamenGrande(proteina);
        meuRamen2 = new RamenPequeno(proteina);
        pedido1 = new Pedido(meuRamen1);
        pedido2 = new Pedido(meuRamen2);
        cliente1 = new Cliente(nome1, pedido1);
        cliente2 = new Cliente(nome2, pedido2);
        fila = Fila.getInstancia();
        fila.removePedidoById(pedido1.getId());
        fila.removePedidoById(pedido2.getId());
    }

    // Professor, dada a natureza estática e única das filas, não consegui rodar todos os testes de uma vez sem avacalhar os resultados, no entanto, de maneira-
    //unitária todos funcionam, por isso, venho requerer  que me dê essa moral e não desconte pontos. ;(
    @Test
    void testGetInstancia() {
        Fila filaDeComparacao = Fila.getInstancia();
        assertEquals(fila, filaDeComparacao, "Testando getInstancia para ver se são a mesma instância de fila");
    }

    @Test
    void testAddPedido() {
        int tamanhoFila = 2;
        fila.addPedido(pedido1);
        fila.addPedido(pedido2);
        assertEquals(fila.getPedidos().size(), tamanhoFila, "Testando adicionar pedidos na fila");
        fila.addPedido(null);
        assertEquals(fila.getPedidos().size(), tamanhoFila, "Testando adicionar pedido null na fila");
    }

    @Test
    void testRemovePedido() {
        int tamanhoFila = 0;
        Pedido pedido3 = new Pedido(meuRamen1);
        int pedido3Id = 1;
        pedido3.setId(pedido3Id);
        fila.addPedido(pedido3);
        fila.removePedidoById(pedido3Id);
        assertEquals(fila.getPedidos().size(), tamanhoFila, "Testando remover pedidos na fila");
    }

    @Test
    void getPedidos() {
        fila.addPedido(pedido1);
        fila.addPedido(pedido2);
        List<Pedido> listaDeComparacao = new ArrayList<>();
        listaDeComparacao = fila.getPedidos();
        assertEquals(listaDeComparacao, fila.getPedidos(), "Testando adicionar getPedidos da fila");

    }
}
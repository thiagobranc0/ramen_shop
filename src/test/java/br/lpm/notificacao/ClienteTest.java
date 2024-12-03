package br.lpm.notificacao;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Proteina boi;
    Ramen meuRamen;
    Cliente cliente;
    String nome;
    Observable novoPedido;

    @BeforeEach
    void setUp() {
        boi = new Boi();
        meuRamen = new RamenGrande(boi);
        novoPedido = new Pedido(meuRamen);
        nome = "Ryu";
        cliente = new Cliente(nome, novoPedido);
    }


    @Test
    void testSetNome() {
        String novoNome = "Thiago";
        cliente.setNome(novoNome);
        assertEquals(novoNome, cliente.getNome(), "Testando set nome de cliente");
        cliente.setNome(null);
        assertEquals(novoNome, cliente.getNome(), "Testando inserir null no set nome de cliente");
    }

    @Test
    void testUpdate() {
        String updateMessage = cliente.update();
        assertEquals(updateMessage, cliente.update(), "Testando update de cliente");
    }
}
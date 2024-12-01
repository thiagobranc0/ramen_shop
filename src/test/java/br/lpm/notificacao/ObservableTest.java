package br.lpm.notificacao;

import br.lpm.proteinas.Boi;
import br.lpm.proteinas.Porco;
import br.lpm.proteinas.Proteina;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObservableTest {
    String nome;
    Proteina proteina;
    Ramen meuRamen;
    Observable pedido;
    Cliente cliente;

    @BeforeEach
    void setUp() {
        nome = "Thiago";
        proteina = new Boi();
        meuRamen = new RamenGrande(proteina);
        pedido = new Pedido(meuRamen);
        cliente = new Cliente(nome, pedido);
    }




    @Test
    void setState() {
        pedido.setState(Pedido.PRONTO);
    }

    @Test
    void setObserver() {
    }

    @Test
    void updateObserver() {
    }
}
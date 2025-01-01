package br.lpm.aplicacao;

import br.lpm.adicionais.Chilli;
import br.lpm.adicionais.CremeAlho;
import br.lpm.balanco.Balanco;
import br.lpm.fabrica.FabricaDeRamen;
import br.lpm.fila.Fila;
import br.lpm.notificacao.Cliente;
import br.lpm.notificacao.Estado;
import br.lpm.notificacao.Pedido;
import br.lpm.proteinas.Vegano;
import br.lpm.ramens.Ramen;
import br.lpm.ramens.RamenGrande;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        FabricaDeRamen fabrica = new FabricaDeRamen();
        int cremeDeAlho = 2;
        int shitake = 5;
        int tofu = 6;
        int KoCha = 9;
        int refrigerante = 7;
        int proteinaExtra = 4;
        int vegano = 3;
        int boi = 1;
        int tamanhoGrande = 3;
        int tamanhoMedio = 2;

        List<Integer> adicionais1 = new ArrayList<Integer>();
        List<Integer> adicionais2 = new ArrayList<Integer>();

        adicionais1.add(cremeDeAlho);
        adicionais1.add(shitake);
        adicionais1.add(tofu);
        adicionais1.add(KoCha);

        adicionais2.add(proteinaExtra);
        adicionais2.add(refrigerante);

        Ramen novoRamen1 = fabrica.makeRamen(vegano, tamanhoGrande, adicionais1);
        Ramen novoRamen2 = fabrica.makeRamen(boi, tamanhoMedio, adicionais2);

        String nome1 = "Thiago";
        String nome2 = "Ana";

        Pedido pedido1 = new Pedido(novoRamen1);
        Pedido pedido2 = new Pedido(novoRamen2);

        Cliente cliente1 = new Cliente(nome1, pedido1);
        Cliente cliente2 = new Cliente(nome2, pedido2);

        System.out.println(pedido1.toString() + '\n');
        System.out.println(pedido2.toString() + '\n');

        Fila fila = Fila.getInstancia();

        fila.addPedido(pedido1);
        fila.addPedido(pedido2);

        System.out.println(pedido1.setState(Estado.PRONTO) + '\n');

        System.out.println(fila.getPedidos());

        System.out.println(pedido1.setState(Estado.RETIRADO) + '\n');

        fila.removePedidoById(1);

        System.out.println(fila.getPedidos());

        Balanco balanco = Balanco.getInstancia();

        balanco.addPedido(pedido1);

        System.out.println(pedido2.setState(Estado.PRONTO) + '\n');
        System.out.println(pedido2.setState(Estado.RETIRADO) + '\n');

        fila.removePedidoById(2);

        balanco.addPedido(pedido2);

        System.out.println(balanco.getPedidos());
        System.out.println(balanco.getReceitaTotal() + '\n');
        System.out.println(balanco.getTicketMedio() + "\n");
        System.out.println(balanco.getQuantidadePedidos());




    }
}

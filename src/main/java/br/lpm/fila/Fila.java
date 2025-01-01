package br.lpm.fila;

import br.lpm.notificacao.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    private static final Fila INSTANCIA = new Fila();
    private List<Pedido> pedidos = new ArrayList<>();
    private int count = 0;

    private Fila() {
    }

    public static Fila getInstancia() {
        return INSTANCIA;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        if (pedido != null) {
            pedido.setId(++count);
            pedidos.add(pedido);
        }
    }

    public void removePedidoById(int id) {
            for (Pedido pedido : pedidos) {
                if (pedido.getId() == id) {
                    pedidos.remove(pedido);
                    break;
                }
            }
    }

    @Override
    public String toString() {
        return "Fila{" +
                "pedidos=" + pedidos +
                '}';
    }
}

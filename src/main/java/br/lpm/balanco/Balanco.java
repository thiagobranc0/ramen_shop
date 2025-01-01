package br.lpm.balanco;

import br.lpm.notificacao.Estado;
import br.lpm.notificacao.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Balanco {
    private static final Balanco INSTANCIA = new Balanco();
    private List<Pedido> pedidos = new ArrayList<>();

    private Balanco() {
    }

    public static Balanco getInstancia() {
        return INSTANCIA;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public int getQuantidadePedidos() {
        return pedidos.size();
    }

    public double getReceitaTotal() {
       return pedidos.stream()
                .map(pedido -> pedido.getRamen().getPreco())
                .reduce(0.0, (preco1, preco2) -> preco1 + preco2);
    }

    public double getTicketMedio() {
        return this.getReceitaTotal() / this.getQuantidadePedidos();
    }

    public void addPedido(Pedido pedido) {
        if (pedido != null && pedido.getState().equals(Estado.RETIRADO)) {
            pedidos.add(pedido);
        }
    }

    @Override
    public String toString() {
        return "Balanco{" +
                "pedidos=" + pedidos +
                '}';
    }
}

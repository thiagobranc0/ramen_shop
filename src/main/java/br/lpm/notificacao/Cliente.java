package br.lpm.notificacao;

public class Cliente extends Observer {
    private String nome;

    public Cliente(String nome, Observable observable) {
        super(observable);
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    @Override
    public String update() {
        if(super.getObservable().getState().equals(Estado.PREPARANDO)) {
            return "Pedido de " + this.getNome() + " em preparo.";
        }
        if(super.getObservable().getState().equals(Estado.PRONTO)) {
            return "Pedido de " + this.getNome() + " pronto.";
        }
        if(super.getObservable().getState().equals(Estado.RETIRADO)) {
            return "Pedido de " + this.getNome() + " retirado.";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome +
                '}';
    }
}

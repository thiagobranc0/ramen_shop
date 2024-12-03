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
        if(super.getObservable().getState() == 0) {
            return "Pedido pendente: " + this.getNome();
        }
        if(super.getObservable().getState() == 1) {
            return "Pedido pronto: " + this.getNome();
        }
        if(super.getObservable().getState() == 2) {
            return "Pedido retirado: " + this.getNome();
        }
        return null;
    }
}

package pagamentos;

public abstract class Pagamento {
    public Double valor;

    public Pagamento(Double valor) {
        this.valor = valor;
    }

    public String exibirDetalhes() {
        return "pagamentos.Pagamento aprovado!";
    }
}


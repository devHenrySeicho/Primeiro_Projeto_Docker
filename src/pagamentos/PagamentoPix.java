package pagamentos;

public class PagamentoPix extends Pagamento{

    public PagamentoPix(Double valor) {
        super(valor);
    }

    @Override
    public String exibirDetalhes() {
        return "pagamentos.Pagamento via Pix aprovado!";
    }
}

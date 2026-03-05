package pagamentos;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao p1 = new PagamentoCartao(25.00);
        System.out.println(p1.exibirDetalhes());

        PagamentoPix p2 = new PagamentoPix(50.00);
        System.out.println(p2.exibirDetalhes());






    }


}

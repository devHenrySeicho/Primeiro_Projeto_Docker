package funcionario;

public class Desenvolvedor extends Funcionario {

    private int produtividade;


    public Desenvolvedor(String nome, double salarioBase, int produtividade) {
        super(nome, salarioBase);
        this.produtividade = produtividade;
    }

    @Override
    public double calcularVencimentos(){
        double salarioBase =this.salarioBase;
        int produtividade = this.produtividade;
        return super.salarioBase + (salarioBase*produtividade*0.15)/100;
    }
}

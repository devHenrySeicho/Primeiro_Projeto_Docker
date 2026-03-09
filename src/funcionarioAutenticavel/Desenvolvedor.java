package funcionarioAutenticavel;

public class Desenvolvedor extends Funcionario {

    private int produtividade;

    public Desenvolvedor(String nome, double salarioBase, int produtividade, String senha) {
        super(nome, salarioBase);
        this.produtividade = produtividade;
        this.senha = senha;
    }

    @Override
    public double calcularVencimentos(){
        double salarioBase =this.salarioBase;
        int produtividade = this.produtividade;
        return super.salarioBase + (salarioBase*produtividade*0.15)/100;
    }
}

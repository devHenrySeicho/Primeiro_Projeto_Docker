package funcionarioAutenticavel;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase, String senha) {
        super(nome, salarioBase);
        this.senha = senha;

    }

    @Override
    public double calcularVencimentos(){
        double salarioBase;
        return super.salarioBase + 2000.00;
    }
}

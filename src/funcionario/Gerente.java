package funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularVencimentos(){
        double salarioBase;
        return super.salarioBase + 2000.00;
    }
}

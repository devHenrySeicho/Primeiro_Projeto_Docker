package funcionarioAutenticavel;

public abstract class Funcionario implements Autenticavel {
    public String nome;
    public double salarioBase;
    public String senha;
    public boolean isAutenticado;

    @Override
    public boolean login(String senha) {
        //this.senha = senha;
        //Erro de lógica, my bad ;-;
        int lenght = senha.length();

        if (senha.equals(this.senha) && lenght >= 6) {
            System.out.println("Logado com sucesso!");
            isAutenticado = true;
            return true;
        }

        System.out.println("Senha invalida!");
        isAutenticado = false;
        return false;
    }

    public boolean portaDaLoja() {

        if (isAutenticado) {
            System.out.println("Acesso liberado!");
            return true;
        }

        System.out.println("Acesso negado!");
        return false;

    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularVencimentos();

}

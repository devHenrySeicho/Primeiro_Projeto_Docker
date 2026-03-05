package funcionario;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Marlog", 25000.00);
        System.out.println(g1.calcularVencimentos());
    }
}

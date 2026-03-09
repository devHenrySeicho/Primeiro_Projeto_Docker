package funcionarioAutenticavel;

public class Main {
    static void main(String[] args) {
        Gerente g1 = new Gerente("Marlog", 25000.00, "123456");
        g1.login("123456");
        System.out.println(g1.calcularVencimentos());

        Desenvolvedor dev1 = new Desenvolvedor("Henry", 20000.00, 100, "6543210");
        dev1.login("6543210");
        System.out.println(dev1.calcularVencimentos());

        TabletInventario t1 = new TabletInventario(123456);
        t1.login("123456");

        dev1.portaDaLoja();
        t1.portaDaLoja();
    }
}

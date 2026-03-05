package sustentavel;

public class Main {
    public static void main(String[] args){
        Eletronico e1 = new Eletronico(20000.00, 0.03);
        System.out.println(e1.calcularPegadaCarbono());
    }
}

package notificador;

public class Main {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(new EmailNotificador());
        p1.finalizarCompra();

    }
}

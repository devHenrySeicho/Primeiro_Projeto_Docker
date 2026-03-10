package notificador;

public class Pedido implements Notificador {

    private Notificador notificador;


    public Pedido(Notificador notificador) {
        this.notificador = notificador;
    }



    @Override
    public String enviar(String mensagem){
        notificador.enviar(mensagem);
        return mensagem;
    }


    public void finalizarCompra(){
        System.out.println(notificador.enviar("Seu pedido chegou!"));

    }

}

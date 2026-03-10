package notificador;

public class EmailNotificador implements Notificador {

    @Override
    public String enviar(String mensagem){

        return mensagem;
    }
}

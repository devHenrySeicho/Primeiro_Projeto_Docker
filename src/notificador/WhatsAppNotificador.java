package notificador;

public class WhatsAppNotificador implements Notificador{

    @Override
    public String enviar(String mensagem){

        return mensagem;
    }
}

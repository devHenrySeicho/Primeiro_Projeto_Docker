package funcionarioAutenticavel;

public class TabletInventario implements Autenticavel{
    public int pin;
    public boolean isAutenticado;

    @Override
    public boolean login(String senha) {

        try {
            int pin = Integer.parseInt(senha);
            if (pin == this.pin) {
                System.out.println("Logado com sucesso!");
                isAutenticado = true;
                return true;
            }

            System.out.println("PIN invalido!");
            isAutenticado = false;
            return false;
        }

        catch (NumberFormatException e) {
            System.out.println("O PIN deve conter apenas números!");
            isAutenticado = false;
            return false;
        }
    }

    public boolean portaDaLoja() {

        if (isAutenticado) {
            System.out.println("Acesso liberado!");
            return true;
        }

        System.out.println("Acesso negado!");
        return false;

    }

    public TabletInventario(int pin) {
        this.pin = pin;
    }
}

package sustentavel;

public class Eletronico implements Sustentavel {

    private Double tributavel;
    private Double sustentavel;

    public Eletronico(Double tributavel, Double sustentavel) {
        this.tributavel = tributavel;
        this.sustentavel = sustentavel;
    }

    @Override
    public Double calcularPegadaCarbono() {
        return this.tributavel * this.sustentavel;
    }
}

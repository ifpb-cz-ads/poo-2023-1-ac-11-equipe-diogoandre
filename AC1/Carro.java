public class Carro implements PegadaDeCarbono {
    private double consumoCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para o carro
        double pegadaCarbono = consumoCombustivel * 2.3;
        return pegadaCarbono;
    }
}

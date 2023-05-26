public class Edificio implements PegadaDeCarbono {
    private String nome;
    private double consumoEnergia;
    private int numeroPessoas;

    public Edificio(double consumoEnergia, int numeroPessoas) {
        this.consumoEnergia = consumoEnergia;
        this.numeroPessoas = numeroPessoas;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para o edifício
        double pegadaCarbono = consumoEnergia / numeroPessoas;
        return pegadaCarbono;
    }
}

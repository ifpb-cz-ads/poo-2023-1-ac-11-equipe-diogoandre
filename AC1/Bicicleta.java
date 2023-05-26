public class Bicicleta implements PegadaDeCarbono {
    private int kmPercorridos;

    public Bicicleta(int kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public int getKmPercorridos() {
        return kmPercorridos;
    }
    
    public void setKmPercorridos(int kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    @Override
    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para a bicicleta
        double pegadaCarbono = kmPercorridos * 0.01;
        return pegadaCarbono;
    }
}

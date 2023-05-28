import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> pegadas = new ArrayList<>();

        // Criando objetos das classes Edificio, Carro e Bicicleta
        Edificio edificio = new Edificio(10000.0, 50);
        Carro carro = new Carro(10.0);
        Bicicleta bicicleta = new Bicicleta(500);

        // Adicionando os objetos ao ArrayList
        pegadas.add(edificio);
        pegadas.add(carro);
        pegadas.add(bicicleta);

        // Iterando pelo ArrayList e obtendo as pegadas de carbono de cada objeto
        for (PegadaDeCarbono pegada : pegadas) {
            // Imprimindo informações de identificação e pegada de carbono
            if (pegada instanceof Edificio) {
                System.out.print("Edifício: ");
            } else if (pegada instanceof Carro) {
                System.out.print("Carro: " );
            } else if (pegada instanceof Bicicleta) {
                System.out.print("Bicicleta: ");
            }

            double pegadaCarbono = pegada.getPegadaDeCarbono();
            System.out.println("Pegada de Carbono: " + pegadaCarbono);
            System.out.println("-------------------");
        }
    }
}

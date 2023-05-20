public class Triatleta extends Pessoa implements Atleta, Ciclista, Nadador  {
    
    public Triatleta(String nome) {
        super(nome);
    }

    public void aquecer () {
        System.out.println(this.getNome() + " esta aquecendo");
    }

    public void nadar () {
        System.out.println(this.getNome() + " esta nadando");
    }

    public void correrDeBicicleta () {
        System.out.println(this.getNome() + " esta correndo de bicicleta");
    }
}

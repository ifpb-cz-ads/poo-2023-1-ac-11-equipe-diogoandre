class Quadrado extends Quadrilatero {
    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        return lado1 * lado1;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Quadrado:");
        System.out.println("Lado: " + lado1);
    }
}

class Retangulo extends Quadrilatero {
    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Retângulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}

import java.util.ArrayList;

public class FormasGeometricas {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Circulo circulo = new Circulo(3);

        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(circulo);

        for (FormaGeometrica forma : formas) {
            forma.imprimirDados();
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("-------------------");
        }
    }
}

package OO.ExIntegrador.Triangulo;

/**
 * Classe principal para executar o programa e testar a classe Triangulo.
 */
public class Main {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 3, 3); // Triângulo equilátero
        Triangulo triangulo2 = new Triangulo(6, 2, 2); // Triângulo isósceles
        Triangulo triangulo3 = new Triangulo(3, 6, 9); // Triângulo escaleno

        // Exibe as informações do Triângulo 1
        System.out.println("--- Triangulo 1 ---");
        System.out.println(triangulo1);
        System.out.println("Tipo: " + triangulo1.tipoTriangulo());
        System.out.println("Área: " + triangulo1.calcularArea());
        System.out.println("Perímetro: " + triangulo1.calcularPerimetro());

        // Exibe as informações do Triângulo 2
        System.out.println("\n--- Triangulo 2 ---");
        System.out.println(triangulo2.toString());
        System.out.println("Tipo: " + triangulo2.tipoTriangulo());
        System.out.println("Área: " + triangulo2.calcularArea());
        System.out.println("Perímetro: " + triangulo2.calcularPerimetro());

        // Exibe as informações do Triângulo 3
        System.out.println("\n--- Triangulo 3 ---");
        System.out.println(triangulo3.toString());
        System.out.println("Tipo: " + triangulo3.tipoTriangulo());
        System.out.println("Área: " + triangulo3.calcularArea());
        System.out.println("Perímetro: " + triangulo3.calcularPerimetro());
    }
}

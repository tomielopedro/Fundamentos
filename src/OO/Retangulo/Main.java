package OO.ExIntegrador.Retangulo;
import Retangulo.Retangulo;

// Main da classe Retangulo
public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(2, 4);
        Retangulo retangulo2 = new Retangulo(3, 5);

        System.out.println("--- Retangulo 1 ---");
        System.out.println(retangulo1);
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());
        System.out.println("Diagonal: " + retangulo1.calcularDiagonal());

        System.out.println("--- Retangulo 2 ---");
        System.out.println(retangulo2);
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());
        System.out.println("Diagonal: " + retangulo2.calcularDiagonal());
    }
}

package Vetores.ExAula;

public class ExAula1 {

    public static void main(String[] args) {
        // Declaração e inicialização do
        double numeros[] = {1, 1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9};

        // Loop para percorrer o vetor e exibir cada valor junto com sua posição
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor na posição " + i + ": " + numeros[i]);
        }

        // Exibe o tamanho do vetor
        System.out.println("O tamanho do vetor é: " + numeros.length);
    }
}

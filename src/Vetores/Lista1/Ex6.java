/*
 * Programa para criar um vetor de 10 elementos inteiros. Em seguida, cria-se outro vetor
 * onde todos os números negativos do vetor original são substituídos por 0 (zero).
 * O programa exibe o vetor original e o vetor trocado.
 */

package Vetores.Lista1;
import Vetores.BibliotecaVetores;

public class Ex6 {
    public static void main(String[] args) {

        // Inicializa o vetor `numeros` com valores, incluindo alguns negativos
        int numeros[] = {-5, 4, -7, 5, 6, -3, 9, 5, 6, -8};
        int numerosTrocados[];

        // Exibe o vetor original
        System.out.println("Vetor Original:");
        BibliotecaVetores.mostraVetor(numeros);

        // Substitui números negativos por zero e exibe o vetor resultante
        System.out.println("Vetor Trocado:");
        numerosTrocados = trocaPorZero(numeros);
        BibliotecaVetores.mostraVetor(numerosTrocados);
    }

    /**
     * Substitui todos os números negativos no vetor fornecido por 0.
     *
     * @param vet O vetor original com possíveis valores negativos.
     * @return O vetor modificado com números negativos substituídos por 0.
     */
    public static int[] trocaPorZero(int vet[]) {
        // Itera pelo vetor e substitui valores negativos por 0
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
        return vet;
    }
}

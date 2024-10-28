/*
 * Programa para ler um vetor de 10 elementos numéricos e verificar se há elementos com valor igual a 30.
 * Caso existam, o programa exibe as posições onde o valor 30 está armazenado.
 */

package Vetores.Lista1;
import Vetores.BibliotecaVetores;

public class Ex3 {
    public static void main(String[] args) {
        int[] numeros;

        // Lê 10 números inteiros do usuário e armazena no vetor `numeros`
        numeros = BibliotecaVetores.leVetorInt(10);

        // Verifica se há o valor 30 no vetor e exibe suas posições, se existir
        BibliotecaVetores.encontrNum(numeros, 30);
    }
}

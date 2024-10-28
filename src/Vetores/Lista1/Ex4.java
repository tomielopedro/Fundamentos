/*
 * Programa para ler 4 números, armazená-los em um vetor e mostrá-los na ordem inversa de sua leitura.
 */

package Vetores.Lista1;
import java.util.Scanner;
import Vetores.BibliotecaVetores;

public class Ex4 {
    public static void main(String[] args) {
        int numeros[];

        // Lê 4 números inteiros do usuário e armazena no vetor `numeros`
        numeros = BibliotecaVetores.leVetorInt(4);

        // Exibe os elementos do vetor na ordem inversa
        System.out.println("-- Vetor inverso --");
        BibliotecaVetores.mostraInverso(numeros);
    }
}

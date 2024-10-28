package Vetores.Lista2;
import Vetores.BibliotecaVetores;

/**
 * Classe Ex4
 * Este programa lê um vetor de 20 elementos inteiros e exibe as posições onde estão armazenados
 * os números '4'. Caso não haja ocorrências, uma mensagem apropriada é exibida.
 */
public class Ex4 {
    public static void main(String[] args) {
        // Declaração do vetor de inteiros
        int numeros[];

        // Lê 20 elementos inteiros do usuário e os armazena no vetor 'numeros'
        numeros = BibliotecaVetores.leVetorInt(20);

        // Chama o método 'encontrNum' para procurar e exibir as posições do número 4 no vetor
        BibliotecaVetores.encontrNum(numeros, 4);
    }
}

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
        int numeros2[];
        numeros = BibliotecaVetores.geraVetorAleatorio(20);
        int posicao;
        // Lê 20 elementos inteiros do usuário e os armazena no vetor 'numeros'
        //numeros = BibliotecaVetores.leVetorInt(20);

        // Mostra vetor
        BibliotecaVetores.mostraVetor(numeros);

        // Chama o método 'encontrNum' para procurar e exibir as posições do número 4 no vetor

        posicao = BibliotecaVetores.encontraNum(numeros, 4);
        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        }
        else {
            System.out.println("Valor encontrado na posicao: " + posicao);
            BibliotecaVetores.excluir(numeros, 4);
            BibliotecaVetores.mostraVetor(numeros);
        }
    }
}

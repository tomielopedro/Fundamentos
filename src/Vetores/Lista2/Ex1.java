package Vetores.Lista2;
import Vetores.BibliotecaVetores;

import java.util.Scanner;

/**
 * Classe Ex1
 * Este programa manipula dois vetores de inteiros do mesmo tamanho (6).
 * O usuário fornece os dados do primeiro vetor, e o segundo vetor é preenchido com
 * os valores do primeiro vetor somados à posição do elemento.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração dos vetores
        int vet1[];
        int vet2[];

        // Lê os valores do primeiro vetor (vet1) do usuário
        vet1 = BibliotecaVetores.leVetorInt(sc,6); // Lê 6 inteiros do usuário
        System.out.println("Vetor 1");
        BibliotecaVetores.mostraVetor(vet1); // Exibe os elementos do primeiro vetor

        System.out.println("Vetor 2");
        // Preenche o segundo vetor (vet2) com os valores do primeiro vetor somados à posição do elemento
        vet2 = preencheVetor(vet1); // Chama o método para preencher o segundo vetor
        BibliotecaVetores.mostraVetor(vet2); // Exibe os elementos do segundo vetor
    }

    /**
     * Preenche o vetor fornecido somando a posição do elemento ao seu valor.
     *
     * @param vet O vetor de inteiros a ser preenchido.
     * @return O vetor preenchido com os novos valores.
     */
    public static int[] preencheVetor(int[] vet){
        // Percorre cada elemento do vetor
        for(int i = 0; i < vet.length; i++){
            vet[i] = vet[i] + i; // Soma o valor do elemento à sua posição
        }
        return vet; // Retorna o vetor modificado
    }
}

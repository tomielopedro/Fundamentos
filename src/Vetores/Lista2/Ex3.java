package Vetores.Lista2;
import Vetores.BibliotecaVetores;

/**
 * Classe Ex3
 * Este programa gera um vetor X de 15 elementos aleatórios e, a partir desse vetor,
 * cria um vetor R com os 5 primeiros elementos de X e um vetor S com os 10 últimos elementos de X.
 */

public class Ex3 {
    public static void main(String[] args) {
        // Gera um vetor X com 15 elementos aleatórios
        int[] x = BibliotecaVetores.geraVetorAleatorio(15);

        // Declaração dos vetores R e S
        int[] r = new int[5]; // Vetor R para os 5 primeiros elementos
        int[] s = new int[10]; // Vetor S para os 10 últimos elementos

        // Preenche os vetores R e S com os valores do vetor X
        for(int i = 0; i < x.length; i++) {
            if(i < 5) {
                r[i] = x[i]; // Armazena os primeiros 5 elementos de X em R
            } else {
                s[i - 5] = x[i]; // Armazena os 10 últimos elementos de X em S (ajustando o índice)
            }
        }

        // Exibe os vetores gerados
        System.out.println("-- Vetor X");
        BibliotecaVetores.mostraVetor(x); // Exibe o vetor X

        System.out.println("-- Vetor R");
        BibliotecaVetores.mostraVetor(r); // Exibe o vetor R

        System.out.println("-- Vetor S");
        BibliotecaVetores.mostraVetor(s); // Exibe o vetor S
    }
}

package Vetores.Lista2;
import Vetores.BibliotecaVetores;

/**
 * Classe Ex2
 * Este programa lê dois vetores de inteiros: um vetor R de 5 elementos e um vetor S de 10 elementos.
 * Em seguida, gera um vetor X de 15 elementos que contém os elementos de R nas 5 primeiras posições
 * e os elementos de S nas 10 últimas posições.
 */
public class Ex2 {
    public static void main(String[] args) {
        // Declaração dos vetores
        int vet5[], vet10[], vet15[];

        // Lê os valores do vetor R (vet5) do usuário
        System.out.println("-- Vetor 1 -- ");
        vet5 = BibliotecaVetores.leVetorInt(5); // Lê 5 inteiros do usuário

        // Lê os valores do vetor S (vet10) do usuário
        System.out.println("-- Vetor 2 -- ");
        vet10 = BibliotecaVetores.leVetorInt(10); // Lê 10 inteiros do usuário

        // Preenche o vetor X (vet15) com os valores de vet5 e vet10
        vet15 = preencheVetor15(vet5, vet10); // Chama o método para preencher o vetor X
        System.out.println("-- Vetor Unido -- ");
        BibliotecaVetores.mostraVetor(vet15); // Exibe os elementos do vetor X
    }

    /**
     * Preenche o vetor X (vet15) com os valores do vetor vet1 e vet2.
     * As 5 primeiras posições contêm os elementos de vet1 e as 10 últimas posições
     * contêm os elementos de vet2.
     *
     * @param vet1 O vetor de 5 elementos.
     * @param vet2 O vetor de 10 elementos.
     * @return O vetor de 15 elementos preenchido.
     */
    public static int[] preencheVetor15(int[] vet1, int[] vet2) {
        int vet15[] = new int[15]; // Declara e inicializa o vetor de 15 elementos
        // Preenche o vetor de 15 elementos
        for (int i = 0; i < vet15.length; i++) {
            if (i < 5) {
                vet15[i] = vet1[i]; // Armazena os primeiros 5 elementos de vet1
            } else {
                vet15[i] = vet2[i - 5]; // Armazena os 10 elementos de vet2
            }
        }
        return vet15; // Retorna o vetor preenchido
    }
}

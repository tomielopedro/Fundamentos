/*
 * Programa para ler e exibir as notas dos alunos de uma turma.
 * Este programa armazena as notas em um vetor e exibe todas as notas, além de listar aquelas que são menores que 5.0.
 * A turma possui 10 alunos.
 */

package Vetores.Lista1;
import Vetores.BibliotecaVetores;

public class Ex1 {
    public static void main(String[] args) {
        double notas[];

        // Lê as notas dos alunos e armazena em um vetor
        notas = BibliotecaVetores.leVetorDouble(10);

        // Exibe o vetor completo de notas
        System.out.println("-- Vetor Notas --");
        BibliotecaVetores.mostraVetor(notas);

        // Exibe apenas as notas que são menores que 5.0
        System.out.println("-- Notas menores que 5 --");
        notasMenoresQueCinco(notas);
    }

    /**
     * Exibe todas as notas do vetor que são menores que 5.0
     *
     * @param vet O vetor de notas a ser verificado.
     */
    public static void notasMenoresQueCinco(double[] vet){
        for (int i = 0; i < vet.length; i++) {
            // Verifica se a nota é menor que 5.0 e, se for, exibe
            if(vet[i] < 5.0) {
                System.out.println(vet[i]);
            }
        }
    }
}

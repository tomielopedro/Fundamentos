/*
 * Programa para ler as notas de uma turma de 6 alunos, calcular a média da turma
 * e contar quantos alunos obtiveram nota acima dessa média.
 * O programa exibe a média da turma e a quantidade de alunos com nota acima da média.
 */

package Vetores.Lista1;
import Vetores.BibliotecaVetores;

public class Ex5 {
    public static void main(String[] args) {
        double notas[];
        double media;

        // Lê as notas de 6 alunos e armazena no vetor `notas`
        notas = BibliotecaVetores.leVetorDouble(6);

        // Calcula a média das notas da turma
        media = calculaMedia(notas);

        // Exibe a média da turma
        System.out.println("A média da turma é: " + media);

        // Conta e exibe a quantidade de alunos com nota acima da média
        System.out.println("A quantidade de alunos acima da média é: " + contaMedia(notas, media));
    }

    /**
     * Calcula a média das notas do vetor fornecido.
     *
     * @param vet O vetor de notas.
     * @return A média das notas.
     */
    public static double calculaMedia(double[] vet) {
        double soma = 0;

        // Soma todas as notas do vetor
        for(int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        // Retorna a média dividindo a soma pelo número de elementos
        return soma / vet.length;
    }

    /**
     * Conta quantos elementos no vetor estão acima da média fornecida.
     *
     * @param vet O vetor de notas.
     * @param media A média das notas.
     * @return A quantidade de notas acima da média.
     */
    public static int contaMedia(double[] vet, double media) {
        int cont = 0;

        // Conta quantas notas são maiores que a média
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] > media) {
                cont++;
            }
        }

        return cont;
    }
}

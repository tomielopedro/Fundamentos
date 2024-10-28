/*
 * Programa para ler um conjunto de 8 notas de alunos em uma disciplina e determinar a maior nota.
 * As notas são armazenadas no vetor `notas`, e o valor da maior nota é mantido na variável `maiorNota`.
 */

package Vetores.Lista1;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Inicializa o scanner para ler as entradas do usuário
        double notas[] = new double[8];       // Declara um vetor de 8 posições para armazenar as notas
        double maiorNota = 0;                 // Inicializa a variável que armazenará a maior nota com 0

        // Loop para ler as notas e encontrar a maior nota
        for(int i = 0; i < notas.length; i++){
            System.out.print("Insira a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();       // Lê a nota e armazena no vetor

            // Verifica se a nota atual é maior que a maior nota encontrada até o momento
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];         // Atualiza `maiorNota` com a nova nota mais alta
            }
        }

        // Exibe a maior nota
        System.out.println("A maior nota é: " + maiorNota);
    }
}

package Vetores;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe BibliotecaVetores
 *
 * Fornece métodos utilitários para manipulação de vetores de inteiros e de números em ponto flutuante.
 * Inclui funcionalidades para gerar, ler, exibir e encontrar valores em vetores.
 */
public class BibliotecaVetores {

    /**
     * Gera um vetor de números inteiros aleatórios.
     *
     * @param tamanho O tamanho do vetor a ser gerado.
     * @return Um vetor de inteiros com valores aleatórios entre 0 e 99.
     */
    public static int[] geraVetorAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }
        return vetor;
    }


    /**
     * Exibe os elementos de um vetor de inteiros no console.
     *
     * @param vet O vetor de inteiros a ser exibido.
     */
    public static void mostraVetor(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    /**
     * Exibe os elementos de um vetor de números em ponto flutuante no console.
     *
     * @param vet O vetor de doubles a ser exibido.
     */
    public static void mostraVetor(double[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    /**
     * Lê os valores de um vetor de inteiros a partir da entrada do usuário.
     *
     * @param tamanho O tamanho do vetor a ser lido.
     * @return Um vetor de inteiros preenchido com os valores fornecidos pelo usuário.
     */
    public static int[] leVetorInt(int tamanho){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[tamanho];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Insira o valor "+(i+1)+": ");
            vet[i] = sc.nextInt();
        }
        return vet;
    }

    /**
     * Lê os valores de um vetor de números em ponto flutuante a partir da entrada do usuário.
     *
     * @param tamanho O tamanho do vetor a ser lido.
     * @return Um vetor de doubles preenchido com os valores fornecidos pelo usuário.
     */
    public static double[] leVetorDouble(int tamanho){
        Scanner sc = new Scanner(System.in);
        double vet[] = new double[tamanho];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Insira o valor "+(i+1)+": ");
            vet[i] = sc.nextDouble();
        }
        return vet;
    }

    /**
     * Exibe os elementos de um vetor de inteiros em ordem inversa no console.
     *
     * @param vet O vetor de inteiros a ser exibido em ordem inversa.
     */
    public static void mostraInverso(int[] vet){
        for(int i=vet.length-1; i>=0; i--) {
            System.out.print(vet[i]+" ");
        }
        System.out.println();
    }

    /**
     * Procura por um número específico dentro de um vetor de inteiros e exibe sua posição.
     *
     * @param vet O vetor de inteiros onde será feita a busca.
     * @param num O número a ser procurado no vetor.
     */
    public static void encontrNum(int[] vet, int num) {
        boolean encontrado = false;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                System.out.println("Número "+num+" encontrado na posição: " + i);
                encontrado = true;
            }
        }
        if(!encontrado) System.out.println("Número "+num+" não encontrado no vetor");
    }
}

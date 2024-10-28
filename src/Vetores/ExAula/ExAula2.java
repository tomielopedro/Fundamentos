package Vetores.ExAula;

/*
*

* 2) Crie um vetor para 20 alturas em cm (use um vetor de inteiros):
* a) Preencha o vetor com alturas aleatórias do intervalo [0; 200];
* b) Escreva apenas as alturas pares;
* c) Escreva apenas as alturas cujos índices são pares;
* d) Escreva apenas as alturas pares cujos índices são impares;
*  e) Escreva o vetor ao contrário;
* f) Escreva a média de altura;
* g) Escreva quantas alturas estão acima da média;
* h) Escreva a menor altura e a sua posição.
*
* */

public class ExAula2 {

    public static void main(String[] args) {
        // Declaração e inicialização do vetor de alturas
        int alturas[] = {170, 165, 180, 155, 160, 175, 168, 182, 174, 169, 178, 162, 166, 181, 177, 164, 158, 172, 185, 167};
        double mediaAlturas; // Variável para armazenar a média das alturas
        int menorValor[], vetorMultiplicado[]; // Vetores para armazenar a menor altura e o vetor multiplicado

        // Exibe o vetor original de alturas
        System.out.println("----------------------------");
        mostraVetor(alturas);

        // Exibe as alturas que são pares
        System.out.println("----------------------------");
        mostraAlturasPares(alturas);

        // Exibe os índices que são pares
        System.out.println("----------------------------");
        mostraIndicesPares(alturas);

        // Exibe as alturas que são pares e estão em índices ímpares
        System.out.println("----------------------------");
        mostraAlturasParesIndicesImpares(alturas);

        // Exibe o vetor de alturas invertido
        System.out.println("----------------------------");
        mostraVetorInvertido(alturas);

        // Calcula e exibe a média das alturas
        System.out.println("----------------------------");
        mediaAlturas = mediaAlturas(alturas);
        System.out.println("Media Alturas: " + mediaAlturas);

        // Exibe a quantidade de alturas acima da média
        System.out.println("----------------------------");
        System.out.println("Quantidade de alturas acima da média: " + qtdAlturasAcimaMedia(alturas, mediaAlturas));

        // Encontra e exibe a menor altura e sua posição
        System.out.println("----------------------------");
        menorValor = menorAlturaEPosicao(alturas);
        System.out.println("Menor valor: " + menorValor[0] + " pos: " + menorValor[1]);

        // Multiplica cada altura pela sua posição e exibe o vetor resultante
        System.out.println("----------------------------");
        vetorMultiplicado = valorPorPosicao(alturas);
        mostraVetor(vetorMultiplicado);
    }

    // Método para exibir todos os elementos do vetor
    public static void mostraVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    // Método para exibir as alturas que são pares
    public static void mostraAlturasPares(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println("Altura par: " + vet[i]);
            }
        }
    }

    // Método para exibir os índices que são pares
    public static void mostraIndicesPares(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Indice par: " + i);
            }
        }
    }

    // Método para exibir as alturas que são pares e estão em índices ímpares
    public static void mostraAlturasParesIndicesImpares(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0 && i % 2 == 1) {
                System.out.println("Altura par indice impar: " + vet[i]);
            }
        }
    }

    // Método para exibir o vetor invertido
    public static void mostraVetorInvertido(int vet[]) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }
        System.out.println(); // Para nova linha após a impressão do vetor invertido
    }

    // Método para calcular a média das alturas
    public static double mediaAlturas(int vet[]) {
        double media = 0;
        for (int i = 0; i < vet.length; i++) {
            media += vet[i]; // Soma todas as alturas
        }
        return media / vet.length; // Retorna a média
    }

    // Método para contar quantas alturas estão acima da média
    public static int qtdAlturasAcimaMedia(int vet[], double media) {
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                cont++; // Incrementa contador se a altura for maior que a média
            }
        }
        return cont; // Retorna a contagem
    }

    // Método para encontrar a menor altura e sua posição
    public static int[] menorAlturaEPosicao(int vet[]) {
        int vetor[] = {Integer.MAX_VALUE, 0}; // Inicializa vetor com valor máximo e posição 0
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < vetor[0]) { // Se a altura atual é menor que a menor encontrada
                vetor[0] = vet[i]; // Atualiza a menor altura
                vetor[1] = i; // Atualiza a posição da menor altura
            }
        }
        return vetor; // Retorna vetor contendo menor altura e sua posição
    }

    // Método para multiplicar cada elemento do vetor pela sua posição
    public static int[] valorPorPosicao(int vet[]) {
        int vetor[] = new int[vet.length]; // Cria um vetor para armazenar os resultados

        for (int i = 0; i < vet.length; i++) {
            vetor[i] = vet[i] * i; // Multiplica a altura pela posição
        }

        return vetor; // Retorna o vetor com os valores multiplicados
    }
}

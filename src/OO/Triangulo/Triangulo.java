package OO.ExIntegrador.Triangulo;

import Biblioteca.BibliotecaTrabalho;

/**
 * Classe que representa um triângulo.
 *
 * A classe permite definir um triângulo com três lados e calcular suas propriedades,
 * como área, perímetro e tipo.
 */
public class Triangulo {

    private double lado1;  // Comprimento do primeiro lado
    private double lado2;  // Comprimento do segundo lado
    private double lado3;  // Comprimento do terceiro lado
    private double base;    // Base do triângulo (lado mais longo)
    private double altura;  // Altura do triângulo (lado mais curto)

    /**
     * Construtor da classe Triangulo.
     *
     * @param lado1 Comprimento do primeiro lado do triângulo.
     * @param lado2 Comprimento do segundo lado do triângulo.
     * @param lado3 Comprimento do terceiro lado do triângulo.
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = defineBase();
        this.altura = defineAltura();
    }

    // Getters e setters

    /**
     * Retorna a altura do triângulo.
     *
     * @return altura do triângulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define a altura do triângulo.
     *
     * @param altura Altura a ser definida.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Retorna a base do triângulo.
     *
     * @return base do triângulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Define a base do triângulo.
     *
     * @param base Base a ser definida.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Retorna o comprimento do lado 1 do triângulo.
     *
     * @return lado1 do triângulo.
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Define o comprimento do lado 1 do triângulo.
     *
     * @param lado1 Comprimento a ser definido.
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Retorna o comprimento do lado 2 do triângulo.
     *
     * @return lado2 do triângulo.
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Define o comprimento do lado 2 do triângulo.
     *
     * @param lado2 Comprimento a ser definido.
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Retorna o comprimento do lado 3 do triângulo.
     *
     * @return lado3 do triângulo.
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Define o comprimento do lado 3 do triângulo.
     *
     * @param lado3 Comprimento a ser definido.
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Métodos

    /**
     * Determina o tipo do triângulo com base nos comprimentos dos lados.
     *
     * @return String representando o tipo de triângulo: "Equilátero", "Isósceles" ou "Escaleno".
     */
    public String tipoTriangulo() {
        if (this.lado1 == this.lado2 && this.lado1 == this.lado3) {
            return "Equilátero";
        } else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }

    /**
     * Calcula a área do triângulo usando a fórmula: (base * altura) / 2.
     *
     * @return Área do triângulo.
     */
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    /**
     * Calcula o perímetro do triângulo, que é a soma dos comprimentos dos lados.
     *
     * @return Perímetro do triângulo.
     */
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Define a base do triângulo como o maior valor entre os lados.
     *
     * @return O maior valor entre os lados.
     */
    private double defineBase() {
        return BibliotecaTrabalho.maiorValor(this.lado1, this.lado2, this.lado3);
    }

    /**
     * Define a altura do triângulo como o menor valor entre os lados.
     *
     * @return O menor valor entre os lados.
     */
    private double defineAltura() {
        return BibliotecaTrabalho.menorValor(this.lado1, this.lado2, this.lado3);
    }

    /**
     * Retorna uma representação em String do triângulo, incluindo seus lados, base e altura.
     *
     * @return String com as informações do triângulo.
     */
    public String toString() {
        return "Lado1:" + this.lado1 + " Lado2:" + this.lado2 + " Lado3:" + this.lado3 + " Base:" + this.base + " Altura:" + this.altura;
    }
}

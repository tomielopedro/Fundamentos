package OO.ExIntegrador.Retangulo;

/**
 * A classe Retangulo representa um retângulo definido por sua base e altura.
 * Ela fornece métodos para calcular a área, o perímetro e a diagonal do retângulo.
 */
public class Retangulo {

    // Atributos
    private double base;
    private double altura;

    /**
     * Construtor que inicializa um retângulo com base e altura especificadas.
     *
     * @param base a base do retângulo
     * @param altura a altura do retângulo
     */
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters e Setters

    /**
     * Obtém a base do retângulo.
     *
     * @return a base do retângulo
     */
    public double getBase() {
        return this.base;
    }

    /**
     * Define a base do retângulo.
     *
     * @param base a nova base do retângulo
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtém a altura do retângulo.
     *
     * @return a altura do retângulo
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * Define a altura do retângulo.
     *
     * @param altura a nova altura do retângulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos

    /**
     * Calcula a área do retângulo.
     *
     * @return a área do retângulo
     */
    public double calcularArea() {
        return this.base * this.altura;
    }

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return o perímetro do retângulo
     */
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    /**
     * Calcula a diagonal do retângulo usando o teorema de Pitágoras.
     *
     * @return a diagonal do retângulo
     */
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }

    /**
     * Retorna uma representação em string do retângulo.
     *
     * @return uma string que representa a base e a altura do retângulo
     */
    public String toString() {
        return "base: " + this.base + ", altura: " + this.altura;
    }
}

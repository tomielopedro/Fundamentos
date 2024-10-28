package OO.ExIntegrador.RevisaoOO;

/**
 * A classe Esfera representa uma esfera geométrica, permitindo calcular
 * sua área e volume a partir do seu raio.
 */
public class Esfera {
    private double raio;     // Raio da esfera
    private double volume;   // Volume da esfera
    private double area;     // Área da superfície da esfera

    /**
     * Construtor padrão da classe Esfera. Inicializa o raio, volume e
     * área com zero.
     */
    public Esfera() {
        this.raio = 0;
        this.volume = 0;
        this.area = 0;
    }

    /**
     * Retorna o raio da esfera.
     *
     * @return o raio da esfera
     */
    public double getRaio() {
        return this.raio;
    }

    /**
     * Define o raio da esfera.
     *
     * @param raio o novo valor do raio da esfera
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * Retorna o volume da esfera. O volume é calculado com base no
     * raio atual.
     *
     * @return o volume da esfera
     */
    public double getVolume() {
        return this.volume;
    }

    /**
     * Calcula e define o volume da esfera com base no raio atual.
     */
    public void setVolume() {
        this.volume = 4.0/3 * Math.PI * Math.pow(this.raio, 3);
    }

    /**
     * Retorna a área da esfera. A área é calculada com base no
     * raio atual.
     *
     * @return a área da esfera
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Calcula e define a área da esfera com base no raio atual.
     */
    public void setArea() {
        this.area = 4 * Math.PI * Math.pow(this.raio, 2);
    }

    /**
     * Retorna uma representação em string da esfera, incluindo
     * o raio, a área e o volume.
     *
     * @return uma string com informações sobre a esfera
     */
    @Override
    public String toString() {
        return "\nO raio da esfera é: " + this.raio +
                "\nA área é: " + this.area +
                "\nO volume é: " + this.volume;
    }
}

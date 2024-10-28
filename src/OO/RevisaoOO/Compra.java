package OO.ExIntegrador.RevisaoOO;

/**
 * A classe Compra representa uma transação de compra que envolve um cliente,
 * uma esfera e um valor associado à compra.
 *
 * <p>Esta classe permite armazenar informações sobre uma compra específica e
 * fornece métodos para acessar e modificar esses dados.</p>
 *
 * <p>Autor: Pedro Tomielo</p>
 * <p>Data: 21/10/24</p>
 */
public class Compra {
    // Atributos
    private Cliente cliente; // Cliente que realizou a compra
    private Esfera esfera;   // Esfera adquirida na compra
    private double valor;    // Valor total da compra

    /**
     * Construtor da classe Compra.
     *
     * @param cliente o cliente que realiza a compra
     * @param esfera a esfera adquirida
     * @param valor o valor total da compra
     */
    public Compra(Cliente cliente, Esfera esfera, double valor) {
        this.cliente = cliente;
        this.esfera = esfera;
        this.valor = valor;
    }

    // Getters
    /**
     * Retorna o cliente associado à compra.
     *
     * @return o cliente da compra
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Retorna a esfera adquirida na compra.
     *
     * @return a esfera da compra
     */
    public Esfera getEsfera() {
        return this.esfera;
    }

    /**
     * Retorna o valor total da compra.
     *
     * @return o valor da compra
     */
    public double getValor() {
        return this.valor;
    }

    // Setters
    /**
     * Define um novo cliente para a compra.
     *
     * @param cliente o novo cliente da compra
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Define uma nova esfera para a compra.
     *
     * @param esfera a nova esfera da compra
     */
    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    /**
     * Define um novo valor para a compra.
     *
     * @param valor o novo valor da compra
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna uma representação em string da compra, incluindo informações
     * sobre o cliente, a esfera e o valor da compra.
     *
     * @return uma string com os detalhes da compra
     */
    @Override
    public String toString() {
        return "Compra{" +
                "cliente=" + this.cliente +
                ", esfera=" + this.esfera +
                ", valor=" + this.valor +
                '}';
    }
}

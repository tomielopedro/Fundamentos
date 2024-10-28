package OO.ExIntegrador;

/**
 * A classe Inquilino representa um inquilino que aluga um imóvel.
 * Cada inquilino tem um nome, um ID único e uma renda.
 *
 * @Author Pedro Tomielo
 * @Date 16/10/24
 */
public class Inquilino {

    // Atributos
    private String nome;      // Nome do inquilino
    private int id;          // ID único do inquilino
    private double renda;     // Renda do inquilino

    /**
     * Constrói um inquilino com nome, ID e renda.
     *
     * @param nome nome do inquilino
     * @param id ID único do inquilino
     * @param renda renda do inquilino
     */
    public Inquilino(String nome, int id, double renda) {
        this.nome = nome;
        this.id = id;
        this.renda = renda;
    }

    // Getters

    /**
     * Retorna o nome do inquilino.
     *
     * @return o nome do inquilino
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna o ID do inquilino.
     *
     * @return o ID do inquilino
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retorna a renda do inquilino.
     *
     * @return a renda do inquilino
     */
    public double getRenda() {
        return this.renda;
    }

    // Setters

    /**
     * Define o nome do inquilino.
     *
     * @param nome o nome a ser definido para o inquilino
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o ID do inquilino.
     *
     * @param id o ID a ser definido para o inquilino
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Define a renda do inquilino.
     *
     * @param renda a renda a ser definida para o inquilino
     */
    public void setRenda(double renda) {
        this.renda = renda;
    }

    /**
     * Retorna uma representação em string do inquilino.
     *
     * @return uma string contendo informações sobre o inquilino
     */
    @Override
    public String toString() {
        return ("Nome: " + this.nome +
                "\nId: " + this.id +
                "\nRenda: " + this.renda);
    }
}

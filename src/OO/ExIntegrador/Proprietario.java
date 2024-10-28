package OO.ExIntegrador;

/**
 * A classe Proprietario representa o proprietário de um imóvel.
 * Cada proprietário possui um nome e um ID único.
 *
 * @Author Pedro Tomielo
 * @Date 16/10/24
 */
public class Proprietario {

    // Atributos
    private String nome; // Nome do proprietário
    private int id;      // ID único do proprietário

    /**
     * Constrói um proprietário com nome e ID.
     *
     * @param nome nome do proprietário
     * @param id ID único do proprietário
     */
    public Proprietario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters

    /**
     * Retorna o nome do proprietário.
     *
     * @return o nome do proprietário
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna o ID do proprietário.
     *
     * @return o ID do proprietário
     */
    public int getId() {
        return this.id;
    }

    // Setters

    /**
     * Define o nome do proprietário.
     *
     * @param nome o nome a ser definido para o proprietário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o ID do proprietário.
     *
     * @param id o ID a ser definido para o proprietário
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna uma representação em string do proprietário.
     *
     * @return uma string contendo informações sobre o proprietário
     */
    @Override
    public String toString() {
        return "Nome: " + this.nome + " Id: " + this.id;
    }
}

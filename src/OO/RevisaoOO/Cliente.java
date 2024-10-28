package OO.ExIntegrador.RevisaoOO;

/**
 * A classe Cliente representa um cliente em um sistema de compras,
 * armazenando informações básicas como nome, número e endereço.
 *
 * <p>Esta classe permite acessar e modificar os dados do cliente.</p>
 *
 * <p>Autor: Pedro Tomielo</p>
 * <p>Data: 21/10/24</p>
 */
public class Cliente {

    // Atributos
    private String nome;      // Nome do cliente
    private int nmr;         // Número do cliente
    private String endereco;  // Endereço do cliente

    /**
     * Construtor da classe Cliente.
     *
     * @param nome o nome do cliente
     * @param nmr o número do cliente
     * @param endereco o endereço do cliente
     */
    public Cliente(String nome, int nmr, String endereco) {
        this.nome = nome;
        this.nmr = nmr;
        this.endereco = endereco;
    }

    // Getters
    /**
     * Retorna o nome do cliente.
     *
     * @return o nome do cliente
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna o número do cliente.
     *
     * @return o número do cliente
     */
    public int getNmr() {
        return this.nmr;
    }

    /**
     * Retorna o endereço do cliente.
     *
     * @return o endereço do cliente
     */
    public String getEndereco() {
        return this.endereco;
    }

    // Setters
    /**
     * Define um novo nome para o cliente.
     *
     * @param nome o novo nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define um novo número para o cliente.
     *
     * @param nmr o novo número do cliente
     */
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

    /**
     * Define um novo endereço para o cliente.
     *
     * @param endereco o novo endereço do cliente
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna uma representação em string do cliente, incluindo
     * o nome, número e endereço.
     *
     * @return uma string com os detalhes do cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "Nome: " + this.nome + "\n" +
                "Numero: " + this.nmr + "\n" +
                "Endereço: " + this.endereco +
                '}';
    }
}

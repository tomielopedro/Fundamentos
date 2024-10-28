package OO.ExIntegrador;

/**
 * A classe Imovel representa um imóvel que pode ser alugado ou vendido.
 * Cada imóvel tem um número, uma descrição, um status, um proprietário e, opcionalmente, um inquilino.
 *
 * @Author Pedro Tomielo
 * @Date 16/10/24
 */
public class Imovel {

    // Atributos
    private int nmr;                 // Número do imóvel
    private String descricao;        // Descrição do imóvel
    private char status;             // Status do imóvel (ex: 'A' para ativo, 'I' para inativo)
    private Proprietario proprietario; // Proprietário do imóvel
    private Inquilino inquilino;     // Inquilino do imóvel (pode ser nulo se não houver inquilino)

    /**
     * Constrói um imóvel com número, descrição, status e proprietário.
     *
     * @param nmr número do imóvel
     * @param descricao descrição do imóvel
     * @param status status do imóvel
     * @param proprietario proprietário do imóvel
     */
    public Imovel(int nmr, String descricao, char status, Proprietario proprietario) {
        this.nmr = 0;                 // Inicializando como zero, deve ser ajustado no setter
        this.descricao = "";          // Inicializando como vazio, deve ser ajustado no setter
        this.status = ' ';            // Inicializando como espaço, deve ser ajustado no setter
        this.proprietario = null;     // Inicializando como nulo, deve ser ajustado no setter
    }

    /**
     * Constrói um imóvel com número, descrição, status, proprietário e inquilino.
     *
     * @param nmr número do imóvel
     * @param descricao descrição do imóvel
     * @param status status do imóvel
     * @param proprietario proprietário do imóvel
     * @param inquilino inquilino do imóvel (pode ser nulo se não houver inquilino)
     */
    public Imovel(int nmr, String descricao, char status, Proprietario proprietario, Inquilino inquilino) {
        this.nmr = nmr;
        this.descricao = descricao;
        this.status = status;
        this.proprietario = proprietario;
        this.inquilino = inquilino;
    }

    // Getters

    /**
     * Retorna a descrição do imóvel.
     *
     * @return a descrição do imóvel
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Retorna o status do imóvel.
     *
     * @return o status do imóvel
     */
    public char getStatus() {
        return this.status;
    }

    /**
     * Retorna o número do imóvel.
     *
     * @return o número do imóvel
     */
    public int getNmr() {
        return this.nmr;
    }

    /**
     * Retorna o proprietário do imóvel.
     *
     * @return o proprietário do imóvel
     */
    public Proprietario getProprietario() {
        return this.proprietario;
    }

    /**
     * Retorna o inquilino do imóvel.
     *
     * @return o inquilino do imóvel
     */
    public Inquilino getInquilino() {
        return this.inquilino;
    }

    // Setters

    /**
     * Define o número do imóvel.
     *
     * @param nmr o número a ser definido para o imóvel
     */
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

    /**
     * Define a descrição do imóvel.
     *
     * @param descricao a descrição a ser definida para o imóvel
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define o status do imóvel.
     *
     * @param status o status a ser definido para o imóvel
     */
    public void setStatus(char status) {
        this.status = status;
    }

    /**
     * Define o proprietário do imóvel.
     *
     * @param proprietario o proprietário a ser definido para o imóvel
     */
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Define o inquilino do imóvel.
     *
     * @param inquilino o inquilino a ser definido para o imóvel
     */
    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    /**
     * Retorna uma representação em string do imóvel.
     *
     * @return uma string contendo informações sobre o imóvel
     */
    @Override
    public String toString() {
        return ("Numero: " + this.nmr +
                "\nDescrição: " + this.descricao +
                "\nStatus: " + this.status +
                "\n-- Inquilino-- : " + this.inquilino +
                "\n-- Proprietario-- : " + this.proprietario
        );
    }
}

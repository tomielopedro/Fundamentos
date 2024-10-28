package OO.ExIntegrador;

/**
 * A classe AppImovel é a classe principal que executa a aplicação para gerenciar imóveis,
 * proprietários e inquilinos. Nela, são realizados diversos testes e operações envolvendo
 * as classes Inquilino, Proprietario e Imovel.
 *
 * @Author Pedro Tomielo
 * @Date 16/10/24
 */
public class AppImovel {

    public static void main(String[] args) {
        // Criação de inquilinos
        Inquilino inquilino1 = new Inquilino("Inquilino1", 1, 10000.00);
        Inquilino inquilino2 = new Inquilino("Inquilino2", 2, 50000.00);

        // Criação de proprietários
        Proprietario proprietario1 = new Proprietario("Proprietario1", 1);
        Proprietario proprietario2 = new Proprietario("Proprietario2", 2);

        // Criação de imóveis
        Imovel imovel1 = new Imovel(439, "Imovel1", 'I', proprietario1, inquilino1);
        Imovel imovel2 = new Imovel(433, "Imovel2", 'D', proprietario2);

        // Exibição de inquilinos
        System.out.println("---- Inquilinos ----");
        System.out.println(inquilino1 + "\n");
        System.out.println(inquilino2); // Exibe o inquilino2

        // Exibição de proprietários
        System.out.println("\n---- Proprietários ----");
        System.out.println(proprietario1 + "\n");
        System.out.println(proprietario2);

        // Exibição de imóveis
        System.out.println("\n---- Imóveis ----");
        System.out.println("\n  - Imóvel 1 - ");
        System.out.println(imovel1 + "\n");
        System.out.println("\n - Imóvel 2 -");
        System.out.println(imovel2);

        // Aluguel de imóvel
        imovel2.setInquilino(inquilino2);
        imovel2.setStatus('I');
        System.out.println("\n---- Imóvel Alugado ----");
        System.out.println(imovel2);

        // Verificação de igualdade entre proprietários
        System.out.println("\n---- Comparação de Proprietários ----");
        if (proprietario1.getId() == proprietario2.getId()) {
            System.out.println("Os proprietários são iguais." + "\n");
        } else {
            System.out.println("Os proprietários são diferentes.");
        }

        // Identificação do inquilino com maior renda
        System.out.println("\n---- Inquilino com Maior Renda ----");
        if (inquilino1.getRenda() > inquilino2.getRenda()) {
            System.out.println(inquilino1);
        } else if (inquilino2.getRenda() > inquilino1.getRenda()) {
            System.out.println(inquilino2);
        } else {
            System.out.println("Ambos os inquilinos têm a mesma renda:");
            System.out.println(inquilino1 + "\n");
            System.out.println(inquilino2 + "\n");
        }

        // Desocupação de imóvel
        imovel1.setInquilino(null);
        imovel1.setStatus('D');
        System.out.println("\n---- Imóvel Desocupado ----");
        System.out.println(imovel1 + "\n");
    }
}

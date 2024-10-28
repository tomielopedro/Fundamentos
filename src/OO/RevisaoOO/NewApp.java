package OO.ExIntegrador.RevisaoOO;

/**
 * A classe NewApp é a classe principal que executa a aplicação.
 *
 * <p>Esta classe cria instâncias de {@link Esfera}, {@link Cliente} e {@link Compra},
 * e demonstra operações como verificação de compras pelo mesmo cliente,
 * determinação da compra com o menor valor, e listagem de clientes que compraram esferas.</p>
 *
 * <p>Autor: Pedro Tomielo</p>
 * <p>Data: 21/10/24</p>
 */
public class NewApp {

    public static void main(String[] args) {
        double r1, r2, r3; // Raízes das esferas
        Esfera e1 = new Esfera(); // Criação da esfera 1
        Esfera e2 = new Esfera(); // Criação da esfera 2
        Esfera e3 = new Esfera(); // Criação da esfera 3

        // Definindo os raios das esferas
        r1 = 2.5;
        r2 = 3.5;
        r3 = 3.5;

        // Configurando propriedades das esferas
        e1.setRaio(r1);
        e1.setArea();
        e1.setVolume();

        e2.setRaio(r2);
        e2.setArea();
        e2.setVolume();

        e3.setRaio(r3);
        e3.setArea();
        e3.setVolume();

        // Criação dos clientes
        Cliente c1 = new Cliente("Cliente1", 1, "Endereço 1");
        Cliente c2 = new Cliente("Cliente2", 2, "Endereço 2");
        // Cliente c3 = new Cliente("Cliente3", 3, "Endereço 3"); // Exemplo comentado

        // Criação das compras
        Compra com1 = new Compra(c1, e1, 12.5);
        Compra com2 = new Compra(c1, e2, 15.5);
        Compra com3 = new Compra(c2, e3, 20.5);

        // Compras com o mesmo nome
        System.out.println("-- Compras com o mesmo nome -- " + "\n");
        if (com1.getCliente().getNome().equals(com2.getCliente().getNome())) {
            System.out.println("Compra 1 e 2 feitas pelo mesmo cliente");
            System.out.println("\n" + com1 + "\n");
            System.out.println("\n" + com2 + "\n");
        }

        // Esfera com o menor preço
        System.out.println("\n" + "-- Esfera com o menor preço-- " + "\n");
        if (com1.getValor() < com2.getValor() && com1.getValor() < com3.getValor()) {
            System.out.println("Compra 1 com o menor valor");
            System.out.println(com1);
        } else if (com2.getValor() < com1.getValor() && com2.getValor() < com3.getValor()) {
            System.out.println("Compra 2 com o menor valor");
            System.out.println(com2);
        } else {
            System.out.println("Compra 3 com menor valor");
            System.out.println(com3);
        }

        // Nome dos clientes que compraram as esferas
        System.out.println("\n" + "-- Nome dos clientes que compraram esferas --" + "\n");
        System.out.println(com1.getCliente().getNome());
        System.out.println(com2.getCliente().getNome());
        System.out.println(com3.getCliente().getNome());

        // Compras com esfera de área menor que 60
        System.out.println("\n" + "-- Esfera com área < 60 compradas pelo C1 --" + "\n");
        if (com1.getCliente().getNome().equals(c1.getNome())) {
            if (com1.getEsfera().getArea() < 60) {
                System.out.println("Esfera compra 1 com área menor que 60m");
            } else {
                System.out.println("Esfera compra 1 com área maior ou igual a 60m");
            }
        }

        if (com2.getCliente().getNome().equals(c1.getNome())) {
            if (com2.getEsfera().getArea() < 60) {
                System.out.println("Esfera compra 2 com área menor que 60m");
            } else {
                System.out.println("Esfera compra 2 com área maior ou igual a 60m");
            }
        }

        if (com3.getCliente().getNome().equals(c1.getNome())) {
            if (com3.getEsfera().getArea() < 60) {
                System.out.println("Esfera compra 3 com área menor que 60m");
            } else {
                System.out.println("Esfera compra 3 com área maior ou igual a 60m");
            }
        }
    }
}

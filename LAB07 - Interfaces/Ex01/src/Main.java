public class Main {
    public static void main(String[] args) {
        Cliente [] clientes = new Cliente[3];
        clientes[0] = new Cliente("A");
        clientes[1] = new Cliente("a");
        clientes[2] = new Cliente("B");

        Produto [] produtos = new Produto[3];
        produtos[0] = new Produto(123);
        produtos[1] = new Produto(321);
        produtos[2] = new Produto(44);

        Servico [] servicos = new Servico[3];
        servicos[0] = new Servico(45.6F);
        servicos[1] = new Servico(78.9F);
        servicos[2] = new Servico(12.33F);

        Classificador ordenador = new Classificador();

        ordenador.ordena(clientes);
        ordenador.ordena(produtos);
        ordenador.ordena(servicos);

        System.out.println("=== CLIENTES ===");
        for(int i = 0; i < 3; i++)
            System.out.println(clientes[i].getNome());

        System.out.println("=== PRODUTOS ===");
        for(int i = 0; i < 3; i++)
            System.out.println(produtos[i].getCodigo());

        System.out.println("=== SERVIÇOS ===");
        for(int i = 0; i < 3; i++)
            System.out.println(servicos[i].getPreco());
    }
}
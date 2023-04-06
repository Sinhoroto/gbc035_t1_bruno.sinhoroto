public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Pedido pedido = new Pedido(1, cliente);
        
        System.out.println("Número do pedido: " + pedido.getNumero());
        System.out.println("Nome do cliente: " + pedido.getCliente().getNome());
    }
}

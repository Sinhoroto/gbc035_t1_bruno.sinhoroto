public class Pedido {
    private int numero;
    private Cliente cliente;
    
    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
}

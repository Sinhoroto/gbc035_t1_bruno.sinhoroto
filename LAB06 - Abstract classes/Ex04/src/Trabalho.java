public class Trabalho extends Contato{
    private String tipo;

    public Trabalho(String ap, String nm, String em, String an, String tp) {
        super(ap, nm, em, an);
        tipo = tp;
    }

    public String imprimirContato()
    {
        this.imprimirBasic();
        System.out.println("Tipo: " + tipo);
        return "";
    }

    public String getTipo()
    {
        return tipo;
    }
}

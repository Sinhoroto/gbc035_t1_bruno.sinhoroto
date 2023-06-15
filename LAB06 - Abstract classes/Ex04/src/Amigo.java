public class Amigo extends Contato{
    private int grau;

    public Amigo(String ap, String nm, String em, String an, int g) {
        super(ap, nm, em, an);
        grau = g;
    }

    public String imprimirContato()
    {
        this.imprimirBasic();
        if (grau == 1)
            System.out.println("Amizade: Melhor Amigo");
        else if (grau == 2)
            System.out.println("Amizade: Amigo");
        else if (grau == 3)
            System.out.println("Amizade: Conhecido");
        return "";
    }

    public int getGrau()
    {
        return grau;
    }
}

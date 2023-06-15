public class Familia extends Contato{
    private String parentesco;

    public Familia(String ap, String nm, String em, String an, String par) {
        super(ap, nm, em, an);
        parentesco = par;
    }

    public String imprimirContato()
    {
        this.imprimirBasic();
        System.out.println("Parentesco: " + parentesco);
        return "";
    }

    public String getParentesco()
    {
        return parentesco;
    }
}

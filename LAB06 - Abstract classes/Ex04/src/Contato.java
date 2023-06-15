import javax.swing.plaf.basic.DefaultMenuLayout;

public abstract class Contato {
    protected String apelido, nome, email, aniversario;

    public Contato (String ap, String nm, String em, String an)
    {
        apelido = ap;
        nome = nm;
        email = em;
        aniversario = an;
    }

    public String imprimirBasic()
    {
        System.out.println("Apelido: " + apelido);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Aniversário: " + aniversario);
        return "";
    }

    public abstract String imprimirContato();
}

public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o)
    {
        Produto compara = (Produto) o;
        if (this.getCodigo() < compara.getCodigo())
            return true;
        else
            return false;
    }
}

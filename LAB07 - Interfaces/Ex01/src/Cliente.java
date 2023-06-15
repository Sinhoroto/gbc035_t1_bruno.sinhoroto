public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        if (compara.getNome().compareTo(this.getNome()) > 0)
            return true;
        else
            return false;
    }
}
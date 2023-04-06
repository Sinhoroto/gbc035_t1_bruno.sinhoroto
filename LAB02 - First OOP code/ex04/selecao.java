import java.util.ArrayList;

public class Selecao {
    private String nome;
    private ArrayList<Figurinha> jogadoresTitulares;
    private String nomeTecnico;
    private int rankingFIFA;

    public Selecao(String nome, ArrayList<Figurinha> jogadoresTitulares, String nomeTecnico, int rankingFIFA) {
        this.nome = nome;
        this.jogadoresTitulares = jogadoresTitulares;
        this.nomeTecnico = nomeTecnico;
        this.rankingFIFA = rankingFIFA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Figurinha> getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(ArrayList<Figurinha> jogadoresTitulares) {
        this.jogadoresTitulares = jogadoresTitulares;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public int getRankingFIFA() {
        return rankingFIFA;
    }

    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }
}


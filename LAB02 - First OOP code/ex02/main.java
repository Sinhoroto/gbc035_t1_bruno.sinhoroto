import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha figurinha1 = new Figurinha("Neymar Jr.", LocalDate.of(1992, 2, 5), 1.75, 68.5, "Atacante", "Brasil");
        Figurinha figurinha2 = new Figurinha("Lionel Messi", LocalDate.of(1987, 6, 24), 1.70, 72.1, "Atacante", "Argentina");
        Figurinha figurinha3 = new Figurinha("Cristiano Ronaldo", LocalDate.of(1985, 2, 5), 1.87, 84.5, "Atacante", "Portugal");

        System.out.println("Figurinha 1:");
        System.out.println("Nome do Jogador: " + figurinha1.getNomeJogador());
        System.out.println("Data de Nascimento: " + figurinha1.getDataNascimento());
        System.out.println("Altura: " + figurinha1.getAltura());
        System.out.println("Peso: " + figurinha1.getPeso());
        System.out.println("Posição: " + figurinha1.getPosicao());
        System.out.println("País: " + figurinha1.getPais());
        System.out.println();

        System.out.println("Figurinha 2:");
        System.out.println("Nome do Jogador: " + figurinha2.getNomeJogador());
        System.out.println("Data de Nascimento: " + figurinha2.getDataNascimento());
        System.out.println("Altura: " + figurinha2.getAltura());
        System.out.println("Peso: " + figurinha2.getPeso());
        System.out.println("Posição: " + figurinha2.getPosicao());
        System.out.println("País: " + figurinha2.getPais());
        System.out.println();

        System.out.println("Figurinha 3:");
        System.out.println("Nome do Jogador: " + figurinha3.getNomeJogador());
        System.out.println("Data de Nascimento: " + figurinha3.getDataNascimento());
        System.out.println("Altura: " + figurinha3.getAltura());
        System.out.println("Peso: " + figurinha3.getPeso());
        System.out.println("Posição: " + figurinha3.getPosicao());
        System.out.println("País: " + figurinha3.getPais());
        System.out.println();
    }
}


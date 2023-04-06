import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha[] figurinhas = new Figurinha[3];

        // Instanciando as Figurinhas
        figurinhas[0] = new Figurinha("Neymar Jr.", LocalDate.of(1992, 2, 5), 1.75, 68.5, "Atacante", "Brasil");
        figurinhas[1] = new Figurinha("Lionel Messi", LocalDate.of(1987, 6, 24), 1.70, 72.1, "Atacante", "Argentina");
        figurinhas[2] = new Figurinha("Cristiano Ronaldo", LocalDate.of(1985, 2, 5), 1.87, 84.5, "Atacante", "Portugal");

        // Exibindo as informações de todas as Figurinhas
        for (int i = 0; i < figurinhas.length; i++) {
            System.out.println("Figurinha " + (i + 1) + ":");
            System.out.println("Nome do Jogador: " + figurinhas[i].getNomeJogador());
            System.out.println("Data de Nascimento: " + figurinhas[i].getDataNascimento());
            System.out.println("Altura: " + figurinhas[i].getAltura());
            System.out.println("Peso: " + figurinhas[i].getPeso());
            System.out.println("Posição: " + figurinhas[i].getPosicao());
            System.out.println("País: " + figurinhas[i].getPais());
            System.out.println();
        }
    }
}


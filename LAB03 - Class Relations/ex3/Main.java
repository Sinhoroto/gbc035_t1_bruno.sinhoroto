public class Main {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Azul", "Verde", "Amarelo");
        
        System.out.println("Cores dos quartos da minha casa:");
        System.out.println("- Quarto 1: " + minhaCasa.getQuarto1().getCor());
        System.out.println("- Quarto 2: " + minhaCasa.getQuarto2().getCor());
        System.out.println("- Quarto 3: " + minhaCasa.getQuarto3().getCor());
    }
}

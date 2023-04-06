public class Casa {
    private Quarto quarto1;
    private Quarto quarto2;
    private Quarto quarto3;
    
    public Casa(String cor1, String cor2, String cor3) {
        this.quarto1 = new Quarto(cor1);
        this.quarto2 = new Quarto(cor2);
        this.quarto3 = new Quarto(cor3);
    }
    
    public Quarto getQuarto1() {
        return quarto1;
    }
    
    public Quarto getQuarto2() {
        return quarto2;
    }
    
    public Quarto getQuarto3() {
        return quarto3;
    }
}

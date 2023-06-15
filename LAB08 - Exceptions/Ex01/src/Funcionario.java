public class Funcionario {

    private String nome, cpf;
    private double salario, teto;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.teto = 40000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTeto() {
        return teto;
    }

    public void setTeto(double teto) {
        this.teto = teto;
    }

    public void aumentaSalario(double aumento) {

        double salarioNovo = this.getSalario() + (this.getSalario() * (aumento / 100));

        if (salarioNovo < 0) {
            System.out.println("Salário atual: " + this.getSalario());
            throw new salarioException("Valor inválido de salário");
        }
        else if (salarioNovo > this.getTeto()) {
            System.out.println("Salário atual: " + this.getSalario());
            throw new salarioException("Valor ultrapassa o teto");
        }

        this.setSalario(salarioNovo);
        System.out.println("Salário atual: " + this.getSalario());
    }
}

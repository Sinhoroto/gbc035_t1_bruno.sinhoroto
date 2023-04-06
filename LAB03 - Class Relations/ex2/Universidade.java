public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;
    
    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
    
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
}

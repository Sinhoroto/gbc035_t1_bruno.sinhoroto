public class Main {
    public static void main(String[] args) {
        Universidade ufu = new Universidade("UFU");
        
        Departamento computacao = new Departamento("Computação");
        Departamento fisica = new Departamento("Física");
        Departamento matematica = new Departamento("Matemática");
        
        ufu.addDepartamento(computacao);
        ufu.addDepartamento(fisica);
        ufu.addDepartamento(matematica);
        
        System.out.println("Departamentos da " + ufu.getNome() + ":");
        for (Departamento departamento : ufu.getDepartamentos()) {
            System.out.println("- " + departamento.getNome());
        }
    }
}

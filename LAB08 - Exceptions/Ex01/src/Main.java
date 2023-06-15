public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("A", "11", 25000);
        try{
            funcionario.aumentaSalario(-1200);
        }catch (salarioException e){
            System.out.println(""+ e.getMessage);
        }
    }
}
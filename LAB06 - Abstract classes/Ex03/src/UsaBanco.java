public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial(1700, 385, 60, 6750);
        ContaEspecial c2 = new ContaEspecial(1560, 1895, 72, 2350);
        ContaEspecial c3 = new ContaEspecial(3666, 795, 93, 12450);

        System.out.println(c1.debitaValor(333, 91));
        System.out.println(c2.debitaValor(-15, 18));
        System.out.println(c3.debitaValor(700, 99));
    }
}
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Contato [] contatos = new Contato [10];
        int op = 0; int o = 0; int conta_contatos = 0; int indice = -1;
        Scanner c = new Scanner(System.in);

        //Variaveis para instanciarmos contato
        String apelido, nome, email, aniversario;
        //Variavel para familia
        String parentesco;
        //Variavel para amigo
        int grau;
        //Variavel para trabalho
        String tipo;

        while (op != 8)
        {
            System.out.println("=== MENU FACEFRIENDS ===");
            System.out.println("[1] Inserir um contato");
            System.out.println("[2] Imprimir todos os contatos");
            System.out.println("[3] Imprimir os familiares");
            System.out.println("[4] Imprimir os amigos");
            System.out.println("[5] Imprimir os colegas");
            System.out.println("[6] Imprimir os melhores amigos, irmãos e os colegas");
            System.out.println("[7] Imprimir um contato");
            System.out.println("[8] SAIR");
            System.out.println("");
            System.out.println("Digite a opção desejada: ");
            op = c.nextInt();
            c.nextLine();

            switch(op) {
                case 1:

                    if (conta_contatos > 9) {
                        System.out.println("Limite de contatos atingido!");
                        break;
                    }

                    System.out.println("Qual tipo de contato?");
                    System.out.println("[1] Familia");
                    System.out.println("[2] Amigo");
                    System.out.println("[3] Trabalho");
                    System.out.println("");
                    System.out.println("Digite a opção desejada: ");
                    o = c.nextInt();
                    c.nextLine();

                    switch (o) {
                        case 1:
                            System.out.println("Apelido: ");
                            apelido = c.nextLine();
                            System.out.println("Nome: ");
                            nome = c.nextLine();
                            System.out.println("E-mail: ");
                            email = c.nextLine();
                            System.out.println("Aniversário: ");
                            aniversario = c.nextLine();
                            System.out.println("Parentesco: ");
                            parentesco = c.nextLine();

                            contatos[conta_contatos] = new Familia(apelido, nome, email, aniversario, parentesco);
                            conta_contatos++;
                            break;

                        case 2:

                            System.out.println("Apelido: ");
                            apelido = c.nextLine();
                            System.out.println("Nome: ");
                            nome = c.nextLine();
                            System.out.println("E-mail: ");
                            email = c.nextLine();
                            System.out.println("Aniversário: ");
                            aniversario = c.nextLine();
                            System.out.println("Grau: ");
                            grau = c.nextInt();
                            c.nextLine();

                            contatos[conta_contatos] = new Amigo(apelido, nome, email, aniversario, grau);
                            conta_contatos++;
                            break;

                        case 3:

                            System.out.println("Apelido: ");
                            apelido = c.nextLine();
                            System.out.println("Nome: ");
                            nome = c.nextLine();
                            System.out.println("E-mail: ");
                            email = c.nextLine();
                            System.out.println("Aniversário: ");
                            aniversario = c.nextLine();
                            System.out.println("Tipo: ");
                            tipo = c.nextLine();

                            contatos[conta_contatos] = new Trabalho(apelido, nome, email, aniversario, tipo);
                            conta_contatos++;
                            break;

                        default:

                            break;
                    }

                    break;

                case 2:

                    for (int i = 0; i <= conta_contatos; i++)
                        contatos[i].imprimirContato();

                    break;

                case 3:

                    for (int i = 0; i <= conta_contatos; i++) {
                        if (contatos[i] instanceof Familia)
                            contatos[i].imprimirContato();
                    }

                    break;

                case 4:

                    for (int i = 0; i <= conta_contatos; i++) {
                        if (contatos[i] instanceof Amigo)
                            contatos[i].imprimirContato();
                    }

                    break;

                case 5:

                    for (int i = 0; i <= conta_contatos; i++) {
                        if (contatos[i] instanceof Trabalho)
                            contatos[i].imprimirContato();
                    }

                    break;

                case 6:

                    for (int i = 0; i <= conta_contatos; i++) {
                        if (contatos[i] instanceof Trabalho && ((Trabalho) contatos[i]).getTipo().equals("colega"))
                            contatos[i].imprimirContato();
                        else if (contatos[i] instanceof Amigo && ((Amigo) contatos[i]).getGrau() == 1)
                            contatos[i].imprimirContato();
                        else if (contatos[i] instanceof Familia && ((Familia) contatos[i]).getParentesco().equals("irmão"))
                            contatos[i].imprimirContato();
                    }

                    break;


                case 7:

                    System.out.println("Digite o índice do contato que deseja imprimir: ");
                    indice = c.nextInt();
                    c.nextLine();

                    if (contatos[indice] instanceof Amigo)
                        System.out.println("AMIGO");
                    else if (contatos[indice] instanceof Familia)
                        System.out.println("FAMILIA");
                    else if (contatos[indice] instanceof Trabalho)
                        System.out.println("TRABALHO");

                    contatos[indice].imprimirContato();

                    break;

                default:

                    break;
            }
        }
    }
}
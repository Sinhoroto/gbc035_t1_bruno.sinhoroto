import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[6];
        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %lf:\n",i+1);
            vector[i] = sc.nextDouble();
        }
        int length = vector.length;
        for (int i = 0; i < length / 2; i++) {
            double temp = vector[i];
            vector[i] = vector[length - 1 - i];
            vector[length - 1 - i] = temp;
        }
        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%lf ",vector[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int aux;
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
                System.out.println("Entre com o número " + (i+1));
                aux = sc.nextInt();
                if(aux%2==0) {
                    vet[i] = aux;
                }else{
                    System.out.println("ta errado aqui");
                }
                aux = 0;
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void main(String[] args) {
        // ex01();
        //ex02();
        //ex03();
        ex04();
    }


}

import java.io.PrintStream;
import java.util.Scanner;

public class AntonioP2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maxBairro;
        String[] bairro;
        double[][] dengue;
        double [] variacao;

        do {
            System.out.println("Digite a quantidade de Bairros "+
                    "(valor entre 7 e 21)");
            maxBairro= leitor.nextInt();
        } while (maxBairro < 7 || maxBairro > 21);

        bairro= new String[maxBairro];
        dengue = new double[maxBairro][2];
        variacao = new double [maxBairro];

        for (int i=0; i < bairro.length; i++) {
            System.out.println("Digite o nome do Bairro");
            bairro[i] = leitor.next();
        }

        for (int linha=0; linha < dengue.length; linha++) {
            for (int coluna=0; coluna < dengue[0].length; coluna++) {
                System.out.println("Digite o numero de casos de dengue do mes " +(coluna+1)+
                        " do Bairro " + bairro[linha]);
                dengue[linha][coluna]= leitor.nextInt();
            }
        }



        System.out.printf("%-15s%10s%10s%10s\n", "Bairro",
                "Mes Anterior", "Mes Atual","Variação");
        for (int linha=0; linha < dengue.length; linha++) {
            System.out.printf("%-15s",bairro[linha]);
            for (int coluna=0; coluna < dengue[0].length; coluna++) {
                System.out.printf("%10.2f", dengue[linha][coluna]);
            }
            System.out.println();
        }





        }

}

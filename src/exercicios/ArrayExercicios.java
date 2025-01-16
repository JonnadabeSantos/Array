package exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercicios {
    public static void main(String[] args) {

        String[] times = { "Flamengo", "Palmeiras", "São Paulo", "Athletico-PR", "Atlético-MG", "Corinthians", "Fluminense", "Grêmio" };
        String linha = "=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        String lista = "Lista de times do Brasileirão: ";

        Scanner usuario = new Scanner(System.in);

        while (true) {
            System.out.printf("%s %n%s%n",linha, lista );
            int count = 0;
            for ( String time : times ) {
                System.out.print( time );
                if ( !( count == times.length -1 ) ){
                    System.out.print( " - ");
                }
                count++;
            }


            break;
        }

       /* System.out.print("Digite um valor: ");
        String indice = usuario.nextLine();



        String primeiros = String.format(" Os %s primeiros são: ", indice );
        String ultimos = "Os ultimos são: ";
*/

    }
}
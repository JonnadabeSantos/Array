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

            System.out.println();
            System.out.println();

            String menu = String.format("""
                    %s < Menu > %s
                    
                    1 - Ver os primeiros cololcados
                    2 - Ver os ultimos cololcados
                    3 - Ver o Intervalos entre eles
                    4 - Perquisar a Posição
                    
                    Digite um valor entre (1) e (4):""",linha, linha);

            System.out.print(menu + " ");
            int indice = usuario.nextInt();

            switch (indice) {
                case 3:
                    System.out.print("Selecione o primeiro valor desejado: ");
                    int inter1 = usuario.nextInt();
                    System.out.print("Selecione o segundo valor desejado: ");
                    int inter2 = usuario.nextInt();

                    String [] resultado = Arrays.copyOfRange( times, ( inter1 - 1) ,( inter2 ) );

                    System.out.println(linha);
                    String primeiros = String.format(" O intervalo entre os %d São: ",( inter2 - inter1 ) + 1 );
                    System.out.println(primeiros);

                    for ( String nome : resultado ) {
                        System.out.print( nome + " → ");
                    }
                    break;
            }

            break;

        }




//        String ultimos = "Os ultimos são: ";

    }
}
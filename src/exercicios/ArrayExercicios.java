package exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercicios {
    public static void main(String[] args) {

        boolean endPrograma = false;
        String[] times = { "Flamengo", "Palmeiras", "São Paulo", "Athletico-PR", "Atlético-MG", "Corinthians", "Fluminense", "Grêmio" };
        String linha = "=-=-=-=-=-=-=-=-=-==-=-=-=-=";
        String lista = "Lista de times do Brasileirão: ";

        Scanner usuario = new Scanner(System.in);

        String menu = String.format("""
                    %s < Menu > %s
                    
                    1 - Ver lista completa 
                    2 - Ver os primeiros cololcados
                    3 - Ver os ultimos cololcados
                    4 - Selecionar Intervalos entre eles
                    5 - Perquisar a Posição
                    6 - Finalizar
                    
                    Digite um valor entre (1) e (6):""",linha, linha);

        String menuEscolha = String.format("""
                    %s < Selecione uma Opção > %s
                    
                    1 - Voltar ao Menu Inicial
                    2 - Ir para o Menu Seguinte
                    3 - Finalizar 
                    """, linha, linha);


        System.out.println( "\n" + linha + "BEM VINDO A LISTA DO BRASILEIRÃO" + linha + "\n" );

        while (true) {
            if (endPrograma) {
                break;
            }

            System.out.print(menu + " ");
            int indice = usuario.nextInt();

            switch (indice) {
                case 1:
                    System.out.printf("%n%s%s %n%s%n",linha, linha, lista );
                    int count = 0;
                    for ( String time : times ) {
                        System.out.print( time );
                        if ( !( count == times.length -1 ) ){
                            System.out.print( " - ");
                        }
                        count++;
                    }

                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        indice = usuario.nextInt();

                        if ( indice < 1 || indice > 3 ) {
                            System.out.println("\nOpção inválida ! Selecione uma opção entre 1 e 3:");
                        }


                    } while ( indice < 1 || indice > 3 );


                    if ( indice == 1  ) {
                        break;
                    }
                    else if ( indice == 3  ) {
                        endPrograma = true;
                        break;
                    }
                    // Fim do redirecionamento




                case 2:


                case 4:
                    System.out.print("Selecione o primeiro valor desejado: ");
                    int inter1 = usuario.nextInt();
                    System.out.print("Selecione o segundo valor desejado: ");
                    int inter2 = usuario.nextInt();

                    // Validação se o (inter2) é maior que o (Inter1)
                    if (inter2 < inter1) {

                        while (true) {
                            System.out.println(linha);
                            System.out.println("Error ! o segundo valor não pode ser maior que o primeiro!:");
                            System.out.println(linha);

                            System.out.print("Selecione o primeiro valor desejado: ");
                            inter1 = usuario.nextInt();
                            System.out.print("Selecione o segundo valor desejado: ");
                            inter2 = usuario.nextInt();

                            /* O loop se repetirá ate o (inter2) se maior que o (inter1)
                            impedindo assim que ocorra um erro no comando seguinte → (Arrays.copyOfRange)
                            */

                            if (inter2 > inter1) {
                                break;
                            }

                        }
                    }

                    System.out.println();
                    System.out.println();


                    String [] resultado = Arrays.copyOfRange( times, ( inter1 - 1) ,( inter2 ) );

                    System.out.println(linha);
                    String primeiros = String.format("O intervalo entre os %d São: ",( inter2 - inter1 ) + 1 );
                    System.out.println(primeiros);

                    for ( String nome : resultado ) {
                        System.out.print( nome + " → ");
                    }


                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        indice = usuario.nextInt();

                        if ( indice < 1 || indice > 3 ) {
                            System.out.println("\nOpção inválida ! Selecione uma opção entre 1 e 3:");
                        }
                    } while ( indice < 1 || indice > 3 );

            }
        }




//        String ultimos = "Os ultimos são: ";

    }
}
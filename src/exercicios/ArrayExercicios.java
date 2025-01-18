package exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercicios {
    public static void main(String[] args) {

        boolean endPrograma = false;
        String[] times = { "Flamengo", "Palmeiras", "São Paulo", "Athletico-PR", "Atlético-MG", "Corinthians", "Fluminense", "Grêmio" };
        String linha = "=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=";
        String lista = "Lista de times do Brasileirão: ";

        Scanner usuario = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        String nomePesquisado = texto.nextLine();

        String menu = String.format("""
                    %s < Menu > %s
                    
                    1 - Ver lista completa 
                    2 - Ver os primeiros cololcados
                    3 - Ver os ultimos cololcados
                    4 - Selecionar Intervalos entre eles
                    5 - Pesquisar a Posição
                    6 - Verifique por time
                    7 - Finalizar
                    
                    Digite um valor entre (1) e (7):""",linha, linha);

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
                    System.out.println();

                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        System.out.print("Digite uma Opção: ");
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

                    do {
                        System.out.print("Deseja Ver os primeiros ate qual posição?: ");
                        indice = usuario.nextInt();
                        if (  indice < 1 || indice >  times.length  ){
                            System.out.println("\nOpção inválida ! Selecione uma opção entre 1 e 8:");
                        }
                    }while ( indice < 1 || indice > ( times.length ) );
                    System.out.println();

                    String [] resultado2 = Arrays.copyOfRange( times, 0, indice );
                    System.out.printf("Esses são os primeiros ate a posição %d %n", indice );



                    count = 0;
                    for ( String posição : resultado2 ){
                        System.out.print( posição );
                        if ( !( count == resultado2.length -1 ) ){
                            System.out.print( " → " );
                        }
                        count++;
                    }
                    System.out.println();
                    System.out.println();

                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        System.out.print("Digite uma Opção: ");
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







                case 3:
                    do {
                        System.out.print("Deseja Ver os Ultimos a parti qual posição?: ");
                        indice = usuario.nextInt();
                        if (  indice < 1 || indice >  times.length  ){
                            System.out.println("\nOpção inválida ! Selecione uma opção entre 1 e 8:");
                        }
                    }while ( indice < 1 || indice > ( times.length ) );
                    System.out.println();

                    String [] resultado3 = Arrays.copyOfRange( times, indice - 1, times.length  );
                    System.out.printf("Esses são os ultimos a partir da posição %d %n", indice );



                    count = 0;
                    for ( String posição : resultado3){
                        System.out.print( posição );
                        if ( !( count == resultado3.length -1 ) ){
                            System.out.print( " → " );
                        }
                        count++;
                    }
                    System.out.println();
                    System.out.println();

                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        System.out.print("Digite uma Opção: ");
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








                case 4:
                    System.out.print("Selecione o primeiro valor desejado: ");
                    int inter1 = usuario.nextInt();
                    System.out.print("Selecione o segundo valor desejado: ");
                    int inter2 = usuario.nextInt();

                    // Validação se o (inter2) é maior que o (Inter1)
                    if (inter2 < inter1) {

                        while (true) {
                            System.out.printf("%n%s%s%n"+
                                    "Error ! o segundo valor não pode ser maior que o primeiro!: " +
                                    "%n%s%s%n%n", linha, linha, linha, linha );
                            /*System.out.println(linha);
                            System.out.println("Error ! o segundo valor não pode ser maior que o primeiro!:");
                            System.out.println(linha);*/

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


                    String [] resultado4 = Arrays.copyOfRange( times, ( inter1 - 1) ,( inter2 ) );

                    System.out.println(linha);
                    String primeiros = String.format("O intervalo entre os %d São: ",( inter2 - inter1 ) + 1 );
                    System.out.println(primeiros);

                    count = 0;
                    for ( String nome : resultado4) {
                        System.out.print( nome );
                        if ( !( count == resultado4.length - 1 ) ) {
                            System.out.print( " → " );
                        }
                        count++;
                    }
                    System.out.println();
                    System.out.println();


                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);
                        System.out.print("Digite uma Opção: ");
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






                case 5:
                    do {
                    System.out.print("Deseja Ver o time que esta em qual posição?: ");
                    indice = usuario.nextInt();
                        if (  indice < 1 || indice >  times.length  ){
                            System.out.println("\nOpção inválida ! Selecione uma opção entre 1 e 8:");
                            }

                    }while ( indice < 1 || indice > ( times.length ) );
                    System.out.printf("%nO time que esta na %dº posição é: %s %n%n ", indice, times[ indice - 1 ] );

                    // Redirecionamento do Programa
                    do {
                        System.out.print(menuEscolha);

                        System.out.print("Digite uma Opção: ");
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






                case 6:
                    boolean existe = false;
                    while ( true ){
                        System.out.print("\nDigite o nome do seu time: ");
                        nomePesquisado = texto.nextLine();



                        for ( String nome : times ) {
                            if ( nome.equals(nomePesquisado) ) {
                                System.out.println( nome + " foi encontrado !" );
                                existe = true;
                                break;
                            }
                        }

                        String buscar = existe ? "encontrado" : "nao encontrado";

                        do {
                            System.out.printf("\nTime %s ! Deseja pesquisar outro Time [ S ou N ]?: ", buscar);
                            nomePesquisado = texto.nextLine();

                            if ( ( nomePesquisado.equals("S") || nomePesquisado.equals("s") || nomePesquisado.equals("N") || nomePesquisado.equals("n") ) ) {
                                System.out.println("\nOpção inválida ! Digite [ S ] ou [ N ]: ");
                            }


                        } while ( ( nomePesquisado.equals("S") || nomePesquisado.equals("s") || nomePesquisado.equals("N") || nomePesquisado.equals("n") ) );


                        if ( existe ){
                            break;
                        }

                    }













            }



        }









    }
}
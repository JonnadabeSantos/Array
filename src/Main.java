import com.sun.source.tree.Tree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // tipos de criação

        int [] n1 = new int[3];
        int [] n2 = { 5, 3, 1, 2, 6, 8 };
        int [] n3 = new int[] { 4, 2, 5, 6 };

        // Foreach
        for ( int num : n2)
        {
            System.out.print( num + " ");
        }

        System.out.println();
        System.out.println();

        int cont = 0, contL = 0;

        String [][] semana = new String [3][3];
        semana[0][0] = "Seg";
        semana[0][1] = "Terc";
        semana[0][2] = "Quart";

        semana[1][0] = "Quint";
        semana[1][1] = "Sext";
        semana[1][2] = "Sab";

        semana[2][0] = "Dom";
        semana[2][1] = "Extra";
        semana[2][2] = "Feriado";



        for (int i = 0; i < semana.length; i++) {

            for (int j = 0; j < semana[i].length ; j++) {
                System.out.print(semana[i][j]);

                contL ++;

                // quando não for a ultima linha da ultima coluna
                if  ( !(i == semana.length - 1  && j == semana[i].length - 1) ) {
                    System.out.print(" → ");;




                }
            }
        }


        System.out.println();
        System.out.println();







        String [] diasSemana = new String [contL];

        for ( int i = 0 ; i < semana.length ; i++ )
        {

            for ( int j = 0; j < semana[i].length; j++)
            {
                diasSemana[cont] = semana[i][j];
                cont ++;

            }
        }


        for ( int i = 0; i < diasSemana.length; i ++){

            System.out.print( diasSemana[i] );

            if ( !(i == diasSemana.length -1) )
            {
                System.out.print(" → ");
            }
        }

        System.out.println();
        System.out.println();

        // Foreach Arrays Multidimensionais

        for ( String [] arrBase: semana ) {
            for ( String subBase : arrBase ){
                System.out.println(subBase);
            }


        }


        System.out.println();
        System.out.println();


        int[] arry = { 5,6,9 };

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = arry;
        arrayInt[2] = new int[]{ 1,2,3,4,5,6 };

        for ( int[] arrayBase : arrayInt ) {

            for ( int i = 0; i < arrayBase.length ; i++ ) {

                System.out.print( arrayBase[i] + " ");

                if ( i == arrayBase.length -1 ){
                    System.out.println();
                }
            }
        }





    }
}
import com.sun.source.tree.Tree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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

                // quando não for a ultima linha da ultima coluna
                if  ( !(i == semana.length - 1  && j == semana[i].length - 1) ) {
                    System.out.print(" → ");;

                    //22


                }
            }
        }
    }
}
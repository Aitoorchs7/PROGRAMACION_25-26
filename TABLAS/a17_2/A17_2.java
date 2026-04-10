package tablas.a17_2;

import java.util.Arrays;

public class A17_2 {
    static void main(String[]args) {
        //creamos la tabla matriz
        int[][] t = new int[5][5];
        //en el primer bucle anidado rellenamos la tabla por primero filas y despues comumnas
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                //con esta operacion cada casilla va a cumplir la operacion
                //por ejemplo la casilla i = 0 y j = 0  = 10*0+0 que es 0
                t[i][j] = 10 * i + j;
            }
        }
        //con el segundo bucle pintamos el resultado mediante una tabla x
        // con el for each ponemos la matriz en sus correspondientes lugares pintandose
        //en este caso con un 5*5
                for (int[] x : t) {
                    for (int y : x) {
                        System.out.print(y);
                    }
                    System.out.println();
                }
                System.out.println(Arrays.deepToString(t));


    }
}

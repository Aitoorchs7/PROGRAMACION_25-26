package a17;
import java.util.Arrays;
public class A17 {
    public static void main(String[] args) {
        /* con este bucle anidado conseguimos rellenar primero
        filas y luego columnas dependiendo de las filas
        con cada una de las casillas operando con la operacion
        del segundo for*/
        int[][] t = new int[5][5];
        for(int i = 0; i <t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                t[i][j] = 10 * i +j;
            }
        }
        //con deepToString la pintamos con corchetes
        System.out.println(Arrays.deepToString(t));
    }
}

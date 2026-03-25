
package TABLAS.a05;
import java.util.Arrays;
import java.util.Scanner;
public class A05 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int longitud;
        int fin;


        System.out.println("Introduce de que longitud quieres que sea la tabla: ");
        longitud = sc.nextInt();
        System.out.println("Ahora hasta que numero quieres que sean los valores: ");
        fin = sc.nextInt();

        int[] resultado = rellenaPares(longitud, fin);

        System.out.println(Arrays.toString(resultado));

    }
    public static int[] rellenaPares(int longitud, int fin){
        int t[] = new int[longitud];

        for(int i = 0; i<t.length;i++){
            int num;
            do{
                num = (int) (Math.random()*(fin+1));
            } while(num % 2 != 0);
            t[i] = num;

        }
        Arrays.sort(t);
        return t;


    }

}

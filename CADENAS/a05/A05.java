package CADENAS.a05;
import java.util.Scanner;
public class A05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos el nombre al usuario
         System.out.println("Introduce tu nombre: ");
         String nombre = sc.nextLine();
         String sinVocales = "";

         //en este bucle recorremos palabra por palabra
         //y con el metodo es vocal indicamos si es vocal o no
         // con un booleano, si es vocal la eliminamos
         for (int i = 0; i < nombre.length(); i++) {
             char letra = nombre.charAt(i);
             if (!esVocal(letra)) {
                 sinVocales = sinVocales + letra;
             }
         }
         System.out.println(sinVocales);
    }
    /*este metodo elimina las vocales
    si la letra es algun caracter de el
    string vocales que son las vocales en
    minusculas, devuelve true o false
     */
    static boolean esVocal(char letra) {
        boolean resultado;
        String vocales = "aeiouáéíóú";
        letra = Character.toLowerCase(letra);

        if (vocales.indexOf(letra) == -1) {
            resultado = false;
        }else{
            resultado = true;
        }
        return resultado;
    }
}

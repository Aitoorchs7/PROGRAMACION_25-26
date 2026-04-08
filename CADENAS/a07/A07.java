package cadenas.a07;
import java.util.Scanner;
public class A07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaramos las frases que vamos a pedir y su traduccion
        //ademas el sufijo final para eliminarlo con el metodo
        String frase;
        String traducida;
        final String SUFIJO = "javalen, len, len";
        final String PREFIJO = "javalin, javalon";

        //esta variable booleana controlara el bucle para introducir frases
        boolean a = true;

        //les damos la bienvenida al traductor
        System.out.println("---- Bienvenido al traductor de javalandio a español ----");
        System.out.println("( si desea salir del traductor introduzca salir )");

        // en este bucle, mientras a sea true se repetira para introducir otra frase
        // en caso contrario se pondra salir y sera a false para que salga
        //tambien se puede hacer de una poniendo en los 2 primeros if a = false debajo de la frase traducida
        while (a) {

            /* pedimos la frase, y con estas condiciones, medimos si
             esta en javalandio, quiere salir o tiene un sufijo u otro
             */
            System.out.println("Introduzca la frase que desee traducir: ");
            frase = sc.nextLine();
            if (a == frase.startsWith(PREFIJO)) {

                System.out.println("Genial!! Esta frase esta en javalandio tradicional, su traduccion es: ");
                traducida = frase.substring(PREFIJO.length());
                System.out.println(traducida);

            } else if (a == frase.endsWith("javalen, len, len")) {

                System.out.println("Genial, esta frase tiene un dialecto javalandio, su traduccion es: ");
                traducida = frase.substring(0, frase.length() - SUFIJO.length());
                System.out.println(traducida);

            } else if (a == frase.startsWith("salir")) {
                a = false;
            }else{

                System.out.println("esta frase no esta en javalandio.");

            }

        }
    }
}




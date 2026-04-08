package cadenas.a08;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //crear las varialbles objetos a utilizar
        String palabra;
        String completa = "";

        //pedimos al usuario que introduzca palabras hasta que ponga fin
        System.out.println("Ve introduciendo palabras hasta que para salir pon fin: ");

        /* En este bucle mientras este todo por defecto, es decir true
        pide la palabra, la pasa por el metodo elimina espacios, y la va
        almacenando en completa con espacios
         */
        while (true) {
            palabra = sc.nextLine();

            palabra = eliminaEspacios(palabra);
            //este condicional determina cuando termina el bucle con el break
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            completa += palabra + " ";
        }

        System.out.println(completa);
    }
    /* este metodo, recorre la palabra letra por letra
    y elimina los espacios de la palabra, almacenando
    los valores que no sean espacios en el string resultado
     */
    static String eliminaEspacios(String palabra) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                resultado += palabra.charAt(i);
            }
        }
        return resultado;
    }
}

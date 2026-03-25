package CADENAS.a06;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        //pedimos que introduzca la frase y las palabra que quiere contar
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println("Introduce la palabra a contar:");
        String palabra = sc.nextLine();

        // buscamos la palabra en la frase con el metodo indexOf
        int posicion = frase.indexOf(palabra);

        //mientras se encuentre la posicion en la palabra, se sumara al contador
        while (posicion != -1) {
            contador++;
            posicion = frase.indexOf(palabra, posicion + palabra.length());
        }
        //si el contador acaba en 0 pintamos que no hay ninguno, sino, los mostramos
        if (contador == 0) {
            System.out.println("No existen palabras iguales a esa palabra");
        }else {
            System.out.println("La palabra " + palabra + " se repite: " + contador + " veces");
        }
    }
}





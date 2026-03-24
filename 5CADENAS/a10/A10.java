package a10;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //decalaramos el resultado que depende lo que marque pintaremos un resultado u otro
        boolean sonAnagramas = true;

        //solicitamos 2 palabras
        System.out.println("Introduzca dos palabras: ");
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();

        //para empezar, si las palabras son de igual longitud
        //pueden ser anagramas, si no , pintamos que no pueden ser anagramas
        if(palabra1.length() == palabra2.length()){
            //convertimos el string en una tabla para trabajar más fácil con las posiciones
            char[] letras1 = palabra1.toCharArray();

            /*en este bule recorremos la palabra y
            la comparamos posicion por posicion las letras de la
            palabra1 con las de la palabra 2 con el index,
            buscando si existe.Del modo que una no exista, fallara el
            if y son anagramas pasara a ser false para pasarlo al siguiente
            condicional
             */
            for(int i = 0; i < letras1.length; i++){
                int pos = palabra2.indexOf(letras1[i]);
                if(pos == -1){
                    sonAnagramas = false;
                    break;
                }
            }
            //dependiendo del resultado del condicional seran anagramas o no
            if(sonAnagramas == true) {
                System.out.println("Las palabras " + palabra1 + " y " + palabra2 + " son anagramas");
            }else{
                System.out.println("Las palabras " + palabra1 + " y " + palabra2 + " no son anagramas");
            }


        }else{
            System.out.println("Estas palabras tienen distinta longitud");
            System.out.println("Por lo tanto, no son anagramas");
            sc.close();
        }

    }
}


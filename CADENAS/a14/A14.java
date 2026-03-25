package CADENAS.a14;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        String frase = "   Examen de Java";


        char[] letras  = frase.toCharArray();

        for(int i = 0; i < letras.length; i++){
            if(Character.isWhitespace(letras[i])){
                contador++;
            }
        }
        frase = frase.replace('a', '@');
        frase = frase.strip();

        System.out.println(frase);
        System.out.println("En esta frase hay "+contador+" espacios");
    }
}

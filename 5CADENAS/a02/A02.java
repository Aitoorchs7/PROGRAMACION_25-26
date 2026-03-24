package a02;
import java.util.Scanner;
public class A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int espacios = 0;
        //almaceno un entero para contar los espacio

        //le pido que introduzca una frase al usuario
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        /*en este bucle leemos letra y con el metodo
        character.isWhiteSpace leemos si es espacio o no
        y los contamos*/
        for (int i = 0; i<frase.length(); i++){
            char letra = frase.charAt(i);
            if (Character.isWhitespace(letra)){
                espacios++;
            }
        }
        System.out.println("En esta frase hay: "+ espacios +" espacios en blanco");
    }
}

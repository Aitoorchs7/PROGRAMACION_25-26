package a07;

import java.util.Scanner;

public class Main {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        String respuesta;

        System.out.println("Introduce el texto:");
        String texto = sc.nextLine();

        Texto texto1 = new Texto(texto);
        System.out.println("El texto tiene " + texto1.contarVocales() + " vocales.");
        texto1.contarLetras();
        System.out.println("El texto tiene una longitud máxima de " + texto1.getLongitudMaxima() + " caracteres.");
        

        do {
            System.out.println("Quieres añadir algo al texto? (s/n)");
            respuesta = sc.nextLine();

            if(respuesta.equalsIgnoreCase("s")){
                System.out.println("Al principio o al final? (p/f)");{
                    String posicion = sc.nextLine();
                    if(posicion.equalsIgnoreCase("p")){
                        System.out.println("Introduce el texto a añadir al principio: ");
                        String nuevoTexto = sc.nextLine();
                        texto1.addPrincipio(nuevoTexto);
                        texto1.mostrarTexto();
                    }else if(posicion.equalsIgnoreCase("f")){
                        System.out.println("Introduce el texto a añadir al final: ");
                        String nuevoTexto = sc.nextLine();
                        texto1.addFinal(nuevoTexto);
                        texto1.mostrarTexto();
                    }
                }
            }
        } while (respuesta.equalsIgnoreCase("s"));


        sc.close();          
    }
}

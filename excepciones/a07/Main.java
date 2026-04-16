package excepciones.a07;

import java.io.*;

public class Main {

    static final String RUTA = "excepciones\\ficheros\\numeros.txt";
    static BufferedWriter bw = null;
    public static void main(String[]args){
        // System.out.println(System.getProperty("user.dir"));
        //para saber donde estamos y en vez de poner la ruta completa poner la ruta relativa

        try {
            bw = new BufferedWriter(new FileWriter(RUTA,false));
            //con el append en false eliminamos lo que hay dentro del archivo y añadimos texto
            String frase1 = "En un lugar de la Mancha";
            char[] caracteres = frase1.toCharArray();
            for (char caracter : caracteres) {
                bw.write((int) caracter);
            }
            /** 
            char[] frase1 = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
            bw.flush();
            for(char caracter : frase1){
                bw.write((int) caracter);
            }
                Tambien se podria hacer asi
            */
 
            bw.newLine();
            bw.write("de cuyo nombre no quiero acordarme");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}
    



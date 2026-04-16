package excepciones.a07;

import java.io.*;

public class Main {

    static final String RUTA = "excepciones\\ficheros\\numeros.txt";

    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(RUTA, false); // false = sobreescribir
            bw = new BufferedWriter(fw);

            // Primera línea: escribimos char a char usando FileWriter directamente
            String frase1 = "En un lugar de la Mancha";
            frase1 = frase1.toCharArray();
            for (char caracter : frase1) {
                fw.write((int) caracter); // Usamos fw directamente
            }

            // IMPORTANTE: hay que vaciar el buffer de bw antes de cambiar de método
            // Como hemos escrito con fw directamente, aquí simplemente añadimos el salto
            fw.write(System.lineSeparator()); // Salto de línea también con fw

        
            bw.write("de cuyo nombre no quiero acordarme");
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            // Solo cerramos bw, que internamente cierra también fw
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
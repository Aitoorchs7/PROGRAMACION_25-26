package excepciones.a08;

import java.util.Scanner;
import java.io.*;

public class Main {
    static final String NOMBRECOPIA = "copia_de_";
    static final String RUTA = "excepciones\\ficheros\\";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] texto = new String[100];

            System.out.println("Introduce el nombre del fichero a leer: ");
            String NOMBREFICHERO = sc.nextLine();
            String rutaCompleta = RUTA + NOMBRECOPIA + NOMBREFICHERO;

            try (BufferedReader br = new BufferedReader(new FileReader(RUTA + NOMBREFICHERO))) {
                int i = 0;
                String linea = br.readLine();
                while (linea != null) {
                    linea = br.readLine();
                    texto[i] = linea;
                    i++;
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaCompleta))) {
                    for (int j = 0; j < i; j++) {
                        bw.write(texto[j]);
                        bw.newLine();
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el fichero");
        }
    }
}
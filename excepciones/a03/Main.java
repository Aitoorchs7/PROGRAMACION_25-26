package excepciones.a03;

import java.io.*;

public class Main {
    static final String RUTA_ARCHIVO = "C:\\\\Users\\\\ALUMNO\\\\Desktop\\\\Proyectos_java\\\\bucles\\\\a01\\\\A01.java";
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_ARCHIVO));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
             System.out.println("\nFin del programa");
        }
    }
}
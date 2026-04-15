package excepciones.a04;

import java.io.*;

public class Main {

    static final String RUTA_ARCHIVO = "C:\\Users\\ALUMNO\\Desktop\\numeros.txt";
    static BufferedReader br = null;
    public static void main (String [] args) {
        try {
            double[] resuts = cogerNumeros();
            System.out.println("La suma es: " + resuts[0]);
            System.out.println("La media es: " + resuts[1]);
            System.out.println("El total de numeros es: " + resuts[2]);

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
        }
    }

    public static double[] cogerNumeros() throws IOException, FileNotFoundException{
        
        double[] sumaMedia = new double[3];
        double suma = 0.0;
        int totalNumeros = 0;

        br = new BufferedReader(new FileReader(RUTA_ARCHIVO));
        String linea = br.readLine();

        if(linea != null){
            String[] numeros = linea.split("\\s+");
            for (String numero : numeros) {
                try {
                    suma += Double.parseDouble(numero.trim());
                    totalNumeros++;

                } catch (NumberFormatException e) {
                    System.out.println("Número no válido: " + numero);

                }
            }
        }

        sumaMedia[0] = suma;
        sumaMedia[1] = suma / (linea != null ? linea.split("\\s+").length : 0);
        sumaMedia[2] = totalNumeros;

        return sumaMedia;
    }
    
}
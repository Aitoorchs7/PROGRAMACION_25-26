package excepciones.a07V2;

import java.io.*;


public class Main {
    static final String RUTA = "excepciones\\ficheros\\numeros.txt";
    static BufferedWriter bw = null;
    static FileWriter fw = null;
    public static void main(String [] args){

        try{
        fw = new FileWriter(RUTA,false);
        bw = new BufferedWriter(fw);
        String frase1 = "Linea escrita con FileWriter";
        bw.newLine();
        String frase2 = "Linea escrita con BufferedWriter";

        escribirFichero(fw,frase1);
        escribirFichero(bw,frase2);

        System.out.println("Fichero escrito correctamente.");

        }catch(IOException e){
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        finally{
            if(bw != null){
                try{
                    bw.close();
                    //al crerrar el BufferedWriter se cierra el FileWriter automaticamente
                }
                catch(IOException e){
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }

    }

    public static void escribirFichero(FileWriter fw, String frase){
        try{
            char[] caracteres = frase.toCharArray();
            for (char caracter : caracteres) {
                fw.write((int) caracter);
            }
            fw.write("\n");
                // asi conseguimos el salto de linea con el FileWritter
                fw.flush();
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public static void escribirFichero(BufferedWriter bw,String frase){
        try{
            bw.write(frase);
            bw.newLine();
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    
}

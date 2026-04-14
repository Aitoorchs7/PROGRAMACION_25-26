package excepciones.a02;

import java.io.*;

public class Main {
        static final String RUTA_ARCHIVO = "C:\\Users\\ALUMNO\\Desktop\\Proyectos_java\\bucles\\a01\\A01.java";
    public static void main(String [] args){
        BufferedReader bufferedReader = null;
        String linea = null;

        try{
            FileReader fileReader = new FileReader(RUTA_ARCHIVO);
            bufferedReader = new BufferedReader(fileReader);
            
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            
            bufferedReader.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e  + "( .getMessage() tambien se puede usar)" );
        }finally{
            if(linea != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }finally{
                System.out.println("Archivo leido correctamente");
                }
            }

            System.out.println("\n Fin del programa");
            
        }
        
        
    }

    
}

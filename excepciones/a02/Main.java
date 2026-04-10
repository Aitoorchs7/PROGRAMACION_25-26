package excepciones.a02;

import java.io.*;

public class Main {
    public static void main(String [] args){
        FileReader a = null;

        try{
            a = new FileReader("C:\\Users\\ALUMNO\\Desktop\\Proyectos_java\\bucles\\a01\\A01.java");
        }catch(FileNotFoundException | IOException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Fin del programa");

                   
        }
        
        
    }

    
}

package INTERFACES.a04;

public class ImpresoraAvanzada implements Multifuncion{
    @Override 
    public void imprimir(){
        System.out.println("Imprimiendo documento...");
    }
    @Override 
    public void escanear(){
        System.out.println("Escaneando documento...");
    }
    
}

package a09;

public class Bombilla {
    private boolean estado;
    private static boolean generador = false;

    public Bombilla(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public static void setGenerador(boolean generador){ 
        Bombilla.generador = generador;
    }

    // Getter estático
    public static boolean getGenerador() {
        return generador;
    }

    public void encender(){
        if(Bombilla.generador){
            this.estado = true;
            System.out.println("La bombilla se ha encendido");
        }else{
            System.out.println("No se puede encender la bombilla, el generador esta apagado");
        }
    }
    public void apagar(){
        this.estado = false;
        System.out.println("La bombilla se ha apagado");
    }
    public static void encenderGenerador(){
        Bombilla.generador = true;
        System.out.println("El generador se ha encendido");
    }
    public static void apagarGenerador(){
        Bombilla.generador = false;
        System.out.println("El generador se ha apagado, la bombilla se ha apagado");
    }
    public void display(){
        if(!Bombilla.generador){
            System.out.println("La bombilla esta apagada");
        }else{    
        if(this.estado){
            System.out.println("La bombilla esta encendida");
        }else{
            System.out.println("La bombilla esta apagada");
            }
        }
    }
}

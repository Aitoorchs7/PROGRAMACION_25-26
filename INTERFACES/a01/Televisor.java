package interfaces.a01;

public class Televisor implements DispositivoConectado {
    private boolean encendido;
    private boolean conectado;

      public Televisor() {
        this.encendido = false;
    }
    @Override
    public void encender(){
        encendido = true;
        System.out.println("Televisor prendido");
    }
    @Override
    public void apagar(){
        encendido = false;
        System.out.println("Televisor apagado");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Estado: "+ encendido);
        System.out.println("Red conectada: "+ conectado);
    } 
    @Override
    public void conectar(){
        System.out.println("Buscando actualizaciones de firmware");
        conectado = true;
        System.out.println("Televisor conectado con exito ");
    }
    
}

package INTERFACES.a01;

public class Bombilla implements DispositivoConectado{
    private boolean encendido;

    public Bombilla() {
        this.encendido = false;
    }
    public void encender(){
        encendido = true;
        System.out.println("Bombilla prendida");

    }
    public void apagar(){
        encendido = false;
        System.out.println("Bombilla apagada");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Estado: "+ encendido);
    } 
}

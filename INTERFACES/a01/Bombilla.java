package interfaces.a01;

public class Bombilla implements DispositivoConectado{
    private boolean encendido;

    public Bombilla() {
        this.encendido = false;
    }
    @Override
    public void encender(){
        encendido = true;
        System.out.println("Bombilla prendida");
    }
    @Override
    public void apagar(){
        encendido = false;
        System.out.println("Bombilla apagada");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Estado: "+ encendido);
    } 
}

package PROYECTO_INTEGRADOR.PROFESIONES;
import PROYECTO_INTEGRADOR.HABILIDADES.Atacante;
import PROYECTO_INTEGRADOR.BASES.Personajes;

public class Guerrero extends Personajes implements Atacante {
    

    //con el constructor de la clase guerrero, le damos un nombre y un nivel al personaje
    public Guerrero(String nombre, int nivel){
        super(nombre, nivel);
    }

    //Ademas, ovverideamos el metodo gritar, ya que es obligatorio
    @Override
    public void grito() {
        System.out.println("¡Por la alianza!");
    }
    //el guerrero solo puedo atacar
    @Override
    public void atacar(Personajes objetivo) {
        System.out.println("El guerrero ataca con su espada");
        objetivo.recibirDaño(20);
    }

}

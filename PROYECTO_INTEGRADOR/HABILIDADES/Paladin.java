package proyecto_integrador.habilidades;
import proyecto_integrador.bases.Personajes;

public abstract class Paladin extends Personajes implements Atacante,Curador{

    //tenemos que iveeridear el constructor de la clase personajes
    public Paladin(String nombre, int nivel){
        super(nombre, nivel);
    }
    //al ser paladin, puede atacar y curar 
    //ademas al recibir daño, overrideamos el metodo para que no lo reciba y ademas pinte el mensaje por pantalla
    @Override
    public void recibirDaño(int cantidad){
        System.out.println("El paladín levanta su escudo sagrado y bloquea el ataque");
    }
}

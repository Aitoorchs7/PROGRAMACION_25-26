package PROYECTO_INTEGRADOR.PROFESIONES;
import PROYECTO_INTEGRADOR.HABILIDADES.Atacante;
import PROYECTO_INTEGRADOR.BASES.Personajes;

public class Mago extends Personajes implements Atacante {

    //con el constructor de la clase mago, le damos un nombre y un nivel al personaje
    public Mago(String nombre, int nivel){
        super(nombre, nivel);
    }

    //Ademas, ovverideamos el metodo gritar, ya que es obligatorio
    @Override
    public void grito() {
        System.out.println("¡Fuego y destrucción!");
    }

    //el mago ataca dependiendo de su nivel
    @Override
    public void atacar(Personajes objetivo) {
        //se puede llamar al nivel con this porque esta heredado de la clase personajes
        if(this.nivel <= 5){
            System.out.println("El mago lanza una bola de fuego");
            objetivo.recibirDaño(10);
        }else if(this.nivel > 6){
            System.out.println("El mago lanza una bola de fuego potente");
            objetivo.recibirDaño(30);
        }
    }
    
}

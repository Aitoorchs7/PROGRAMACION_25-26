package proyecto_integrador.profesiones;
import proyecto_integrador.bases.Personajes;
import proyecto_integrador.habilidades.Paladin;

public class Clerigo extends Paladin {

    //con el constructor de la clase clerigo, le damos un nombre y un nivel al personaje
    public Clerigo(String nombre, int nivel){
        super(nombre, nivel);
    }

    //el paladin puede atacar y curar, por loq ue el clerigo debera overridear ambos metodos
    @Override 
    public void atacar(Personajes objetivo) {
        System.out.println("El clérigo ataca con su maza");
        objetivo.recibirDaño(10);
    }
    @Override
    public void curar(Personajes objetivo) {
        System.out.println("El clérigo cura con su hechizo de sanación");
        objetivo.restaurarVida(20);
    }

    //Ademas, ovverideamos el metodo gritar, ya que es obligatorio
    @Override
    public void grito() {
        System.out.println("¡La luz me guía!");
    }
    
    
}

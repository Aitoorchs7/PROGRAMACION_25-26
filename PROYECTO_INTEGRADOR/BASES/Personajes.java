package proyecto_integrador.BASES;

public abstract class Personajes {

    //Atributos basicos de cada personaje que lo tienen todos
    protected String nombre;
    protected int nivel;
    protected int vida = 100;

    //Constructor de la clase personajes 
    public Personajes(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = 100;
    }

    //Getters y setters de cada atributo para saber el estado de cada personaje
    public String getNombre() {
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public int getVida(){
        return vida;
    }
    // metodos que implementan los personajes controlando sus caracteristicas

    //metodos sobre la vida
    public void recibirDaño(int cantidad){
        if(cantidad > 0){
            if(cantidad > vida){
                this.vida = 0;
                System.out.println("Personaje eliminado");
            }else{
                this.vida -= cantidad;
                System.out.println("Golpe bajo con "+ cantidad +" puntos de vida");
                System.out.println("Vida restante: "+vida);
            }
        }else{
            System.out.println("No se puede curar con un ataque");
        }
    }
    public void restaurarVida(int cantidad){
        if(cantidad > 0){
            if(this.vida + cantidad > 100){
                this.vida = 100;
                System.out.println("Personaje curado, vida al maximo");
            }else{
                this.vida += cantidad;
                System.out.println("Vida ahora: "+vida);
            }
        }else{
            System.out.println("No se puede atacar con una cura");
        }
    }
    //metodo incluido sobre subirle el nivel al personaje hasta un maximo de 10, y solo se puede subir de 1 en 1
    public void subirNivel(int cantidad){
        if(nivel < 10){
            if(cantidad == 1){
                nivel++;
                System.out.println("Nivel del personaje: "+nivel);
            }else{
                System.out.println("Solo se le puede subir un nivel por ejecucion");
            }
        }else{
            System.out.println("Personaje a nivel maximo");
        }
    }
    //metodo para obligar al personaje a que elija un grito de guerra cuando herede la clase abstracta
    public abstract void grito();

    
}
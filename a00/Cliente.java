package a00;

public class Cliente extends Persona {
    double presupuesto;
    public Cliente(int edad, String nombre, double estatura, String nacionalidad, double presupuesto){
        super(edad, nombre, estatura, nacionalidad);// cojemos los atributos de la clase Persona
        this.presupuesto = presupuesto;
    }
    @Override// sobreescribimos el metodo con override y con el super llamamos al metodo de la clase Persona mostrarDatos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Presupuesto: " + this.presupuesto);// añadimos el nuevo atributo
    }
    public void cambiarNacionalidad(String nuevaNacionalidad){
        this.nacionalidad = nuevaNacionalidad;// cambiamos la nacionalidad que es un atributo de la clase Persona
    }
}

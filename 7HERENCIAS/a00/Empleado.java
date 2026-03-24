package a00;

public class Empleado extends Persona {
    double salario;
    public Empleado(int edad, String nombre, double estatura, String nacionalidad, double salario){
        super(edad, nombre, estatura, nacionalidad);// cojemos los atributos de la clase Persona
        this.salario = salario;
    }
    @Override// sobreescribimos el metodo con override y con el super llamamos al metodo de la clase Persona mostrarDatos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Salario: " + this.salario);// añadimos el nuevo atributo
    }
    public void aumentarEstatura(double aumento){
        this.estatura += aumento;//aumentamos la estatura que es un atributo de la clase Persona
    }
}

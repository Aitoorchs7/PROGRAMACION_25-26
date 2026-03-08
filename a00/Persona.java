package a00;

public class Persona {
    int edad;
    String nombre;
    double estatura;
    String nacionalidad;

    public Persona(int edad, String nombre, double estatura, String nacionalidad){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }
    public void mostrarDatos(){
        System.out.println("Edad: " + this.edad);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Estatura: " + this.estatura);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void cumplirAños(){
        this.edad++;
    }
    /*  para responder la pregunta del final, podemos crear una clase 
    hija de Empleado, que heredaria de igual forma los atributos y metodos
    de la clase Persona, y el añadido de la clase Empleado, entonces, la clase 
    empleado puede tener una subclase.
    */

}

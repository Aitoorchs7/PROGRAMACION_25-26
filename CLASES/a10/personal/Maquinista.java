package a10.personal;

public class Maquinista {
    public String nombre;
    public String dni;
    public double sueldo;
    

    enum Rango {JUNIOR, SENIOR, EXPERTO};
    public Rango rango;

    public Maquinista(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }
    public Maquinista(String nombre, String dni, double sueldo,String rango ){
        this(nombre, dni);
        this.sueldo = sueldo;
        this.rango = Rango.valueOf(rango);

    }

}

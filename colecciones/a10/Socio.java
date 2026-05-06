package colecciones.a10;

import java.util.Objects;

public class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;

    public Socio(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Socio otro){
        return this.dni.compareTo(otro.dni);
    }

    @Override
    public boolean equals(Object obj) {
        Socio otro = (Socio) obj;
        return this.dni.equals(otro.dni);
    }

    @Override
    public String toString() {
        return "Socio: " +"dni =" + dni + ", nombre=" + nombre + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
}
    
}

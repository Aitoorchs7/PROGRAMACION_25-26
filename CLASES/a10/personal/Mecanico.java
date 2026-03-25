package a10.personal;

public class Mecanico {
    public String nombre;
    public String telefono;
    public String especialidad; // frenos, hidráulica, electricidad o motor

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}

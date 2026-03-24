package a05;

public class Gestor {
    public String nombre;  
    private String telefono;
    

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 1000;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

     double importeMaximo;

     public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }

    public String mostrarInformacion() {
        return "Gestor: " + nombre + ", Teléfono: " + telefono;
    }

}
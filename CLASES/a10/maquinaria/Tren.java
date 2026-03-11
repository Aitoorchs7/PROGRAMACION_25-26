package a10.maquinaria;
import a10.personal.Maquinista;

public class Tren {
    public Locomotora locomotora;
    public Vagon[] vagones;
    public Maquinista responsable;
    private int contadorVagones; // Para controlar el límite de 5

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        this.vagones = new Vagon[5]; // Máximo 5 vagones
        this.contadorVagones = 0;
    }

    // Método para añadir vagones (ya que Vagon no es visible fuera)
    public void agregarVagon(int id, double max, double actual, String carga) {
        if (contadorVagones < 5) {
            vagones[contadorVagones] = new Vagon(id, max, actual, carga);
            contadorVagones++;
        } else {
            System.out.println("El tren ya tiene el máximo de 5 vagones.");
        }
    }
}
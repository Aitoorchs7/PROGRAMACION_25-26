package a10.maquinaria;

class Vagon { // Visibilidad de paquete
    int id;
    double cargaMax;
    double cargaActual;
    String mercancia;

    Vagon(int id, double cargaMax, double cargaActual, String mercancia) {
        this.id = id;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}

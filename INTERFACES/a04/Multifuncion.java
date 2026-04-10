package interfaces.a04;

public interface Multifuncion extends Imprimible, Escaneable {
    //metodo abstracto que incluye ambos comportamientos 
    @Override
    void imprimir();
    @Override
    void escanear();

    
}

package a10.maquinaria;
import a10.personal.Mecanico;

public class Locomotora {
    public String matricula;
    public int potencia;
    public int añoFabricacion;
    public Mecanico mecanicoAsignado;

    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }
}

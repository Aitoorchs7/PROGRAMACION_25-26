package a10;

import a10.personal.*;
import a10.maquinaria.*;

public class Main {
    public static void main(String[] args) {
        // Crear personal
        Maquinista mq = new Maquinista("Juan Pérez", "12345678X", 2500, "Senior");
        Mecanico mc = new Mecanico("Ana Silva", "600112233", "Motor");
        
        // Crear maquinaria
        Locomotora loco = new Locomotora("ABC-123", 3000, 2015, mc);
        
        // Crear tren
        Tren miTren = new Tren(loco, mq);
        
        // Añadimos vagones a través del método del Tren 
        // (No podríamos crear "new Vagon()" aquí por su visibilidad)
        miTren.agregarVagon(1, 10000, 5000, "Trigo");
        
        System.out.println("Tren creado con locomotora " + miTren.locomotora.matricula + 
                           " y maquinista " + miTren.responsable.nombre);
    }
}

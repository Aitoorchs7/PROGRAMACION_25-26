
package colecciones.a11;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class A11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> automoviles = new TreeMap<>();
        int opcion;

        System.out.println("Bienvenido al sistema de gestión de automóviles");
        System.out.println("===================================");
        System.out.println("|Seleccione una opción:           |");
        System.out.println("| 1. Añadir automóvil             |");
        System.out.println("| 2. Eliminar automóvil           |");
        System.out.println("| 3. Buscar automóvil             |");
        System.out.println("| 4. Mostrar todos los automóviles|");
        System.out.println("| 5. Salir                        |");
        System.out.println("===================================");



        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la marca del automóvil:");
                    String marca = sc.next();
                    if(automoviles.containsKey(marca)){
                        System.out.println("El automóvil ya existe en el sistema.");
                    } else {
                        System.out.println("Ingrese el modelo del automóvil:");
                        String modelo = sc.next();
                        System.out.println("Ingrese el stock del automóvil:");
                        int stock = sc.nextInt();
                        automoviles.put(modelo, stock);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el modelo del automóvil a eliminar:");
                    String modeloEliminar = sc.next();
                    if(automoviles.containsKey(modeloEliminar)){
                        automoviles.remove(modeloEliminar);
                        System.out.println("Automóvil eliminado del sistema.");
                    } else {
                        System.out.println("El automóvil no existe en el sistema.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el modelo del automóvil y el nuevo stock:");
                    String modeloActualizar = sc.next();
                    int stockActualizar = sc.nextInt();
                    if(automoviles.containsKey(modeloActualizar)){
                        automoviles.put(modeloActualizar, stockActualizar);
                        System.out.println("Stock actualizado.");
                    } else {
                        System.out.println("El automóvil no existe en el sistema.");
                    }
                    break;
                case 4:
                    for(String modeloAutomovil : automoviles.keySet()){
                        System.out.println("Modelo: " + modeloAutomovil + ", Stock: " + automoviles.get(modeloAutomovil));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
            
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while(opcion == 5);
        sc.close();

    }
    
}

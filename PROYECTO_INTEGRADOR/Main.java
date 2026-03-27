package proyecto_integrador;

import proyecto_integrador.bases.Personajes;
import proyecto_integrador.profesiones.*;

public class Main {
    public static void main(String[] args) {
        
        // 1. Instanciamos los personajes individualmente
        Guerrero g1 = new Guerrero("Cristiano", 1);
        Mago m1 = new Mago("Messi", 6); // Nivel 6
        Clerigo c1 = new Clerigo("Neymar", 5);

        // 2. Agrupamos en un Array de tipo Personajes (el batallón)
        Personajes[] batallon = {g1, m1, c1};

        System.out.println("--- INICIO DE LA PARTIDA DE PRUEBA ---");

        // 3. Recorremos el batallón con un único bucle para los gritos
        System.out.println("¡Gritos de batalla en formación!");
        for (Personajes personaje: batallon) {
            System.out.print(personaje.getNombre() + " grita: ");
            personaje.grito(); // Polimorfismo: cada uno usa su propio grito
        }

        System.out.println("--- SIMULACIÓN DE COMBATE ---");

        // 4. El Guerrero ataca al Mago
        System.out.println("ACCIÓN: Cristiano (Guerrero) ataca a Messi (Mago)");
        g1.atacar(m1);

        // 5. El Clérigo cura al Mago
        System.out.println("\nACCIÓN: Neymar (Clérigo) cura a Messi (Mago)");
        c1.curar(m1);

        // Comprobación final de estados
        System.out.println("\n--- ESTADO FINAL DEL BATALLÓN ---");
        for (Personajes personaje: batallon) {
            System.out.println("Nombre: " + personaje.getNombre() + 
                               " | Vida: " + personaje.getVida() + 
                               " | Nivel: " + personaje.getNivel());
        }
    }
}

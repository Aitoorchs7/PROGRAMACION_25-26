package HERENCIAS.a05;

import HERENCIAS.a04.Instrumento;

public class Piano extends Instrumento{
    
    @Override 
    public void interpretar() {
        System.out.println("Tocando el piano");
        for(int i = 0; i<super.getNumNotas(); i++) {
            int aleatorio = (int)(Math.random()*7)+1;
            
            System.out.println("Nota " + aleatorio);
        }
    }
} 

    

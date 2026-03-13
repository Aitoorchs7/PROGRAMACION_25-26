package HEENCIAS.a01;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(23, 59);
        System.out.println(hora.toString());
        hora.inc();
        System.out.println(hora.toString());

        for(int i = 0; i < 30; i++){
            hora.inc();
            System.out.println(hora.toString());
        }
    }
    
}

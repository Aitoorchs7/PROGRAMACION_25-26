package a05;

public class Main {
    public static void main(String[] args){
        Gestor g1 = new Gestor("Ana Gómez", "641555555");
        Gestor g2 = new Gestor("Luis Martínez", "641666666");

        CuentaCorriente c1 = new CuentaCorriente("12345678A", "Juan Pérez", 500, g1);
        CuentaCorriente c2 = new CuentaCorriente("87654321B", "María López", 0, g2);
        CuentaCorriente c3 = new CuentaCorriente("11223344C", "Jesus Plaza");
        

        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
    }
}